/** This class creates a bookstore and then fills it with books.
 *  It will be used to emphasize
 *  Unit 2 concepts and help you prepare
 *  for Project 2.
 *  @author Nick Hanson
 *  - Created on: October 5, 2024
 */

public class BookStoreBuilder {
    // TODO Create a private instance variable to hold a BookStore object,
    // but do not instantiate it yet
    private BookStore bookStore;

    /* Create books and pass them to the bookstore
     */
    public void createBooks() {
        Book[] books = new Book[3];

        books[0] = new Book();
        books[1] = new Book();
        books[2] = new Book();

        books[0].setTitle("The Whispering Shadows");
        books[0].setAuthor("Sarah Elwell");
        books[0].setPublicationYear(2013);
        books[0].setNumberOfCopies(45);
        books[0].setSize(3.2);

        books[1].setTitle("Beyond the Clouds");
        books[1].setAuthor("Michael Dennsion");
        books[1].setPublicationYear(2018);
        books[1].setNumberOfCopies(23);
        books[1].setSize(2.5);

        books[2].setTitle("Echoes of the Past");
        books[2].setAuthor("Lila Hernandez");
        books[2].setPublicationYear(2005);
        books[2].setNumberOfCopies(68);
        books[2].setSize(4.1);

        bookStore.setBooks(books);
    }

    /** This method instantiates a new Bookstore object and assigns it to the
     * instance variable, calls the createBooks method, and then calls the
     * displayInfo method on the Bookstore object
    */
    public void run() {

        bookStore = new BookStore();

        createBooks();

        bookStore.displayInfo();
    }
}
