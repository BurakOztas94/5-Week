import java.util.Comparator;
// Here is for book name sorter class
public class BookNameComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getBookName().compareTo(b2.getBookName());
    }
}