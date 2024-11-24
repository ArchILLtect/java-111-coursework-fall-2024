/** This class represents a bookstore.
 *  It will be used to emphasize
 *  Unit 2 concepts and help you prepare
 *  for Project 2.
 *  @author Nick Hanson
 *  - Created on: October 5, 2024
*/
public class BookStore {

    // Create the following instance variable, but do not instantiate it.
    // an array that will hold book objects
    private Book[] books;

    /** Method to set an array of books
     *  @param newBooks books to put in the array
    */
    public void setBooks(Book[] newBooks) {
        books = newBooks;
    }

    /** Method to calculate and return the total distance our books take up
     *  @return total distance our books take up
    */
    public double calcTotalDistance() {
        int counter = 0;
        double totalDistance = 0.0;
        // While loop sums book sizes
        while (counter < books.length) {
            totalDistance += books[counter].calcTotalSize();
            counter++;
        };
        totalDistance = Math.round(totalDistance * 100) / 100.0;
        return totalDistance;
    }

    /** Print out the book store's info about each book and the total
     * distance the book take up on the shelf
    */
      public void displayInfo() {
          int counter = 0;
          while (counter < books.length) {
            System.out.println(books[counter].display());
            counter++;
          }
          System.out.println("Total distance taken on shelf: " + String.format("%.2f", calcTotalDistance()) + " cm.");
    }
}

