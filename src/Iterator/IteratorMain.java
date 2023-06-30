package Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        // How to use Iterator
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        // How to use extension for-loop
        for(Book book: bookShelf.getBooks()) {
            System.out.println(book.getName());
        }
        System.out.println();
    }
}
