import java.util.Comparator;
    // Here is for author name sorter class
public class BookAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getAuthorName ().compareTo(b2.getAuthorName ());
    }
}