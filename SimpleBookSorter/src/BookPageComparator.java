import java.util.Comparator;
// Here is for page number sorter class
public class BookPageComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return Integer.compare(book1.getBookPage(), book2.getBookPage());
    }
}