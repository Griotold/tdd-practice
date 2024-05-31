package org.study.tddpasswordchecker.practice0531.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

// The queue should have the following methods:
//Enqueue(object): Adds an element to the queue.
//Dequeue(): Returns the first element and removes it from the queue.
//Peek(): Returns the first element without removing it.
public class QueueTest {

    MyQueue queue;

    @BeforeEach
    void setUp() {
        queue = new MyQueue();
    }
    @Test
    void enqueueTest() {
        queue.enqueue(5);
        int size = queue.size();
        assertThat(size).isEqualTo(1);

        queue.enqueue(6);
        int size2 = queue.size();
        assertThat(size2).isEqualTo(2);
    }

    @Test
    void dequeueTest() {
        queue.enqueue(5);
        int size = queue.size();
        assertThat(size).isEqualTo(1);

        Object result = queue.dequeue();
        int size2 = queue.size();
        assertThat(size2).isEqualTo(0);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void peekTest() {
        queue.enqueue(5);
        queue.enqueue(3);

        Object result = queue.peek();
        int size = queue.size();
        assertThat(result).isEqualTo(5);
        assertThat(size).isEqualTo(2);
    }

    @Test
    void peek_when_queue_size_0_then_exception() {
        assertThatThrownBy(() -> queue.peek())
                .isInstanceOf(IllegalStateException.class);
    }

    @Test
    void dequeue_when_queue_size_0_then_exception() {
        assertThatThrownBy(() -> queue.dequeue())
                .isInstanceOf(IllegalStateException.class);
    }

    @Test
    void multiple_enqueue_and_dequeue_test() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertThat(queue.dequeue()).isEqualTo(1);
        assertThat(queue.dequeue()).isEqualTo(2);
        assertThat(queue.dequeue()).isEqualTo(3);
    }

    @Test
    void enqueue_different_data_type_test() {
        queue.enqueue("string");
        queue.enqueue(1);
        queue.enqueue(3.14);

        assertThat(queue.dequeue()).isEqualTo("string");
        assertThat(queue.dequeue()).isEqualTo(1);
        assertThat(queue.dequeue()).isEqualTo(3.14);
    }

}
