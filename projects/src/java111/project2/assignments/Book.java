/** Represents a book.
 *  Used emphasize Unit 2 concepts and help you prepare
 *  for Project 2.
 *
 *  @author Nick Hanson
 *  - Created on: October 5, 2024
 */
public class Book {

    // Create private instance variables for title, author, publicationYear,
    // numberOfCopies, and size, meaning how thick is the book in cm?
    private String title;
    private String author;
    private int publicationYear;
    private int numberOfCopies;
    private double size; //Thickness in cm

    // The following methods are public getters and setters for each instance variable
    /** Getter method to access the title of the book
     * @return title of the book
    */
    public String getTitle() {
        return this.title;
    }
    /** Setter method to modify the title of the book
     * @param newTitle title of book
    */
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    /** Getter method to access the author of the book
     * @return author of the book
    */
    public String getAuthor() {
        return this.author;
    }
    /** Setter method to modify the author of the book
     * @param newAuthor author of book
    */
    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    /** Getter method to access the publication year of the book
     * @return publication year of book
    */
    public int getPublicationYear() {
        return this.publicationYear;
    }
    /** Setter method to modify the publication year of the book
     * @param newPubYear - number of copies of book
    */
    public void setPublicationYear(int newPubYear) {
        this.publicationYear = newPubYear;
    }

    /** Getter method to access the number of copies of the book
     * @return number of copies of book
    */
    public int getNumberOfCopies() {
        return this.numberOfCopies;
    }
    /** Setter method to modify the number of copies of the book
     * @param newNumberOfCopies - number of copies of book
    */
    public void setNumberOfCopies(int newNumberOfCopies) {
        this.numberOfCopies = newNumberOfCopies;
    }

    /** Getter method to access the thickness (cm) of the book
     * @return book's size (width/thickness in cm)
     */
    public double getSize() {
        return this.size;
    }
    /** Setter method to modify the thickness (cm) of the book
     * @param newSize - book's size (width/thickness in cm)
     */
    public void setSize(double newSize) {
        this.size = newSize;
    }

    /** Calculates the width on the bookshelf that all copies
     * of this book take up (numberOfCopies * size)
     *  @returns the space on shelf that all included books take up (in cm)
     */
    public double calcTotalSize() {
        return numberOfCopies * size;
    }

    /** This method returns a String containing the book information,
     * including the distance this title takes up.
     * @returns book information including total distance
    */

    public String display() {
        String bookInfo = title + " by " + author + " published in " + publicationYear +
                " is " + size + " cm. " + "We have " + numberOfCopies +
                " copies, which take up " + String.format("%.2f", calcTotalSize()) + " cm.";
        return bookInfo;
    }
}
