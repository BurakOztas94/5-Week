
import java.util.TreeSet;

public class Run {

    public static void run ()
        {
            //We created 4 list to compare because if we make it in one set then set can be change so we created and implemented as 4 sets
            TreeSet<Book> booksByName = new TreeSet<> (new BookNameComparator ());
            TreeSet<Book> booksByPage = new TreeSet<> (new BookPageComparator ());
            TreeSet<Book> booksByAuthor = new TreeSet<> (new BookAuthorComparator ());
            TreeSet<Book> booksByPublish = new TreeSet<> (new BookPublishDateComparator ());


            booksByPage.add (new Book ("Sefiller " , 1150 , "Victor Hugo" , 1862));
            booksByPage.add (new Book ("Devlet " , 570 , "Plato" , -342));
            booksByPage.add (new Book ("Hayvan Çiftliği " , 410 , "George Orwell" , 1945));
            booksByPage.add (new Book ("The Da Vinci Code " , 528 , "Dan Brown" , 2003));
            booksByPage.add (new Book ("Cesur Yeni dünya  " , 332 , "Aldous Huxley" , 1932));

            booksByName.add (new Book ("Sefiller " , 1150 , "Victor Hugo" , 1862));
            booksByName.add (new Book ("Devlet " , 570 , "Plato" , -342));
            booksByName.add (new Book ("Hayvan Çiftliği " , 410 , "George Orwell" , 1945));
            booksByName.add (new Book ("The Da Vinci Code " , 528 , "Dan Brown" , 2003));
            booksByName.add (new Book ("Cesur Yeni dünya  " , 332 , "Aldous Huxley" , 1932));

            booksByAuthor.add (new Book ("Sefiller " , 1150 , "Victor Hugo" , 1862));
            booksByAuthor.add (new Book ("Devlet " , 570 , "Plato" , -342));
            booksByAuthor.add (new Book ("Hayvan Çiftliği " , 410 , "George Orwell" , 1945));
            booksByAuthor.add (new Book ("The Da Vinci Code " , 528 , "Dan Brown" , 2003));
            booksByAuthor.add (new Book ("Cesur Yeni dünya  " , 332 , "Aldous Huxley" , 1932));

            booksByPublish.add (new Book ("Sefiller " , 1150 , "Victor Hugo" , 1862));
            booksByPublish.add (new Book ("Devlet " , 570 , "Plato" , -342));
            booksByPublish.add (new Book ("Hayvan Çiftliği " , 410 , "George Orwell" , 1945));
            booksByPublish.add (new Book ("The Da Vinci Code " , 528 , "Dan Brown" , 2003));
            booksByPublish.add (new Book ("Cesur Yeni dünya  " , 332 , "Aldous Huxley" , 1932));


            System.out.println ("Ordered by name : \n");        //Writes data to the terminal by book name

            for ( Book book1 : booksByName )
                {
                    System.out.printf ("%-20s %4d\t\t %-20s %-20s\n " , book1.getBookName () , book1.getBookPage () , book1.getAuthorName () , book1.getPublicationDate ());
                }

            System.out.println ("\nOrdered by page : \n");


            for ( Book book2 : booksByPage )       // Writes data to the terminal by page number
                {
                    System.out.printf ("%-20s %4d\t\t %-20s %-20s\n " , book2.getBookName () , book2.getBookPage () , book2.getAuthorName () , book2.getPublicationDate ());
                }

            System.out.println ("Ordered by Author name : \n");

            for ( Book book3 : booksByAuthor )          //Writes data to the terminal by Author name
                {
                    System.out.printf ("%-20s %4d\t\t %-20s %-20s\n " , book3.getBookName () , book3.getBookPage () , book3.getAuthorName () , book3.getPublicationDate ());
                }

            System.out.println ("\nOrdered by publish date : \n");


            for ( Book book4 : booksByPublish )         //Writes data to the terminal by publication date
                {
                    System.out.printf ("%-20s %4d\t\t %-20s %-20s\n " , book4.getBookName () , book4.getBookPage () , book4.getAuthorName () , book4.getPublicationDate ());
                }



        }


}






