package com.ifmo.lesson4;

/**
 * Библиотека помогает вести учет книг: какие книги и сколько в ней хранятся.
 * Библиотека ограничена по числу типов книг, это ограничение задается аргументом
 * конструктора maxBookKinds. Например, если библиотека ограничена числом 10,
 * то это означает, что она может хранить 10 разных книг, но любое их количество.
 *
 * Если из библиотеки убираются все книги одного типа, то освобождается место,
 * на которое можно добавить книгу другого типа.
 * Например:
 * <pre>
 *     Library library = new Library(2);
 *     library.put(new Book("Stephen King", "Shining"), 2); // return true
 *     library.put(new Book("Stephen King", "Dark Tower"), 3); // return true
 *
 *     // Эту книгу добавить не можем, т.к. лимит 2
 *     library.put(new Book("Tolstoy", "War and peace"), 6); // return false
 *
 *     // Забираем все книги Тёмной башни, чтобы освободить место.
 *     library.take(new Book("Stephen King", "Dark Tower"), 3) // return 3
 *
 *     // Теперь мы можем успешно добавить "Войну и мир".
 *     library.put(new Book("Tolstoy", "War and peace"), 6); // return true
 * </pre>
 *
 * Если попытаться взять из библиотеки больше книг, чем у нее есть, то она
 * должна вернуть только число книг, которые в ней находились и освободить место.
 * Например:
 *
 * <pre>
 *     Library library = new Library(2);
 *     library.put(new Book("Stephen King", "Shining"), 2); // return true
 *
 *     // Все равно вернет 2, т.к. больше нет.
 *     library.take(new Book("Stephen King", "Shining"), 10) // return 2
 * </pre>
 */
public class Library {
    private Shelf[] shelves; //ссылка на Book и колво одинаковых книг  || на полке лежат одинаковые книги

    public Library(int maxBookKinds) {
        // TODO implement
        // Возможно здесь следует сынициализировать массив.
        shelves = new Shelf[maxBookKinds];
    }

    /**
     * Add books to library.
     *
     * @param book Book to add.
     * @param quantity How many books to add.
     * @return {@code True} if book successfully added, {@code false} otherwise.
     */
    public boolean put(Book book, int quantity) {
        for (int i = 0; i < shelves.length; i++) {
            Shelf shelf=shelves[i];//так сделали для удобства

            if (shelf == null){ //мы делаем смещение при удалении ---> null только в конце
                shelves[i]=new Shelf(book, quantity);
                return  true;
            }
            else if (shelf.getBook().equals(book)){
                shelf.setQuantity(shelf.getQuantity() + quantity);
                return true;
            }
        }
        return false;
    }

    /**
     * Take books from library.
     *
     * @param book Book to take.
     * @param quantity How many books to take.
     * @return Actual number of books taken.
     */
    public int take(Book book, int quantity) {
        // TODO implement
        Shelf shelf=null;
        for (int i = 0; i < shelves.length; i++){
            if (shelves[i].equals(book)) {
                shelf = shelves[i];
                break;
            }
        }

        if (shelf== null)
            return 0;
        else if (shelf.getQuantity()>quantity){
            return shelf.changeQuantity(quantity);
        }
        else if (shelf.getQuantity()==quantity){
            deleteShelf(shelf);
            return quantity;
        }
        else {
            int a=shelf.getQuantity();
            deleteShelf(shelf);
            return a;
        }
    }
    //1. пройтись по эл массива и найти соотв книгу book
    // либо не найти
    //1.1. если не нашли возвр 0
    //1.2. если нашли, то из shelf.quantity вычитаем нужно колво книг
    // Math.min(shelf.quantity, quantity)
    //1.2.1. если удалили все книги, то удалить shelf из массива
    //и сдвинуть System.arraycopy

    //удаляет и сдвигает
    private void deleteShelf( Shelf shelf){
        for (int i = 0; i < shelves.length; i++) {
            if (shelf.equals(shelves[i])){
                for (int j = i; j < shelves.length-1; j++) {
                    shelves[i]=shelves[i+1];
                }
                shelves[shelves.length]=null;
                break;
            }
        }
    }


    private int find(Book book){

        return 1;
    }
}
