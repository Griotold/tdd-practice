package org.study.tddpasswordchecker.practice0531.queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    private List<Object> list = new ArrayList<>();

    public void enqueue(Object o) {
        list.add(o);
    }

    public int size() {
        return list.size();
    }

    public Object dequeue() {
        return list.remove(0);
    }

    public Object peek() {
        if (list.isEmpty()) throw  new IllegalStateException();
        return list.get(0);
    }
}
