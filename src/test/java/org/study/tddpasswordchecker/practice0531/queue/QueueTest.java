package org.study.tddpasswordchecker.practice0531.queue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

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
}
