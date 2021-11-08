package com.ifmo.lesson6;

import java.util.Iterator;

/**
 * Односвязный список, где каждый предыдущий
 * элемент харнит ссылку на следующий. Список
 * оканчивается ссылкой со значением {@code null}.
 */
public class LinkedList implements List, Stack, Queue {
    /** Ссылка на первый элемент списка. */
    private Item head;

    /** {@inheritDoc} */
    @Override
    public void add(Object val) {
        Item newItem = new Item(val);
        if (head == null)
            head = newItem;
        else{
            Item current = head;
            while (current != null){
                if (current.next == null) {
                    current.next = newItem;
                    break;
                }
                current = current.next;
            }
        }
    }

    /** {@inheritDoc} */
    @Override
    public Object take() {
        // TODO implement.

        return null;
    }

    /** {@inheritDoc} */
    @Override
    public Object get(int i) {
        Item current = head;
        if (head == null)
            return null;
        for (int j = 0; j < i; j++) {
            //System.out.println(i);
            if (current.next != null)
                current= current.next;
            else
                return null;
        }
        return current.value;
    }

    /** {@inheritDoc} */
    @Override
    public Object remove(int i) {
        Item current = head;
        if (head == null)
            return null;
        if (i ==0){
            Item del = head;
            head=head.next;
            return del.value;
        }
        else {
            for (int j = 0; j < i-1; j++) {
                if (current.next != null)
                    current= current.next;
                else
                    return  null;
            }
            Item del = current.next;
            current.next = del.next;
            return del.value;
        }
    }

    /** {@inheritDoc} */
    @Override
    public Iterator iterator() {
        // TODO implement.

        return null;
    }

    /** {@inheritDoc} */
    @Override
    public void push(Object value) {
        Item newItem = new Item(value);
        if (head == null)
            head = newItem;
        else{
            Item current = head;
            while (current != null){
                if (current.next == null) {
                    current.next = newItem;
                    break;
                }
                current = current.next;
            }
        }
    }

    /** {@inheritDoc} */
    @Override
    public Object pop() {
        Item current=head;
        while (current != null && current.next.next!=null){
            current=current.next;
        }
        Item ret=current.next;
        current.next=null;

        return ret;
    }
}
