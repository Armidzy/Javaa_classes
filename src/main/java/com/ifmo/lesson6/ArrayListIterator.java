package com.ifmo.lesson6;

import java.util.Iterator;

public class ArrayListIterator implements Iterator {
    private Object[] values;

    public ArrayListIterator(Object[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    public boolean hasNext(int i) {
        if (values[i]!=null)
            return true;
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
