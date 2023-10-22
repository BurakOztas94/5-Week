

//constructor class
public class Book {

    private String bookName;
    private int bookPage;

    private String authorName;
    private int publicationDate;


    public Book (String bookName , int bookPage , String authorName , int publishYear)
        {
            this.bookName = bookName;
            this.bookPage = bookPage;
            this.authorName = authorName;
            this.publicationDate = publishYear;


        }

    public String getBookName ()
        {
            return bookName;
        }

    public int getBookPage ()
        {
            return bookPage;
        }

    public String getAuthorName ()
        {
            return authorName;
        }

    public int getPublicationDate ()
        {
            return publicationDate;
        }


}


