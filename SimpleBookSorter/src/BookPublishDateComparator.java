import java.util.Comparator;
// Here is for publish date sorter class
public class BookPublishDateComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return Integer.compare(book1.getPublicationDate (), book2.getPublicationDate ());
    }
}