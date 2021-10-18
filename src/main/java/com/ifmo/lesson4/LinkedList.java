package com.ifmo.lesson4;

/**
 * Односвязный список, где каждый предыдущий
 * элемент харнит ссылку на следующий. Список
 * оканчивается ссылкой со значением {@code null}.
 */
public class LinkedList {
    /** Ссылка на первый элемент списка. */
    private Item head;

    /** Добавляет значение в конец списка.
     * @param val Значение, которое будет добавлено.*/
    public void add(Object val) {
        // TODO implement
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

    /**
     * Извлекает значение из списка по индексу.
     *
     * @param i Индекс значения в списке.
     * @return Значение, которое находится по индексу
     * или {@code null}, если не найдено.
     */
    public Object get(int i) {
        // TODO implement
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

    /**
     * Удаляет значение по индексу и возвращает
     * удаленный элемент.
     *
     * @param i Индекс, по которому будет удален элемент.
     * @return Удаленное значение или {@code null}, если не найдено.
     */
    public Object remove(int i) {
        Item current = head;
        if (head == null)
            return null;
        if (i ==1){
            Item del = head;
            head=head.next;
            return del.value;
        }
        else {
            for (int j = 1; j < i-1; j++) {
                if (current.next != null && j != i)
                    current= current.next;
                else
                    return  null;
            }
            Item del = current.next;
            current.next = del.next;
            return del.value;
        }
    }
}
