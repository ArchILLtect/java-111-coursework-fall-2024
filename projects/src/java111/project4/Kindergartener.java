/**
 *  The Kindergartener subclass (of Student) holds information about a Kindergartener
 *  For Projet 4 - Part 1
 *  @author Nick Hanson
 *      - Created 11/24/24
 */
public class Kindergartener extends Student {
    
    private String showAndTellItem;

    /**
     *  Gets the showAndTellItem of the Kindergartener
     *
     * @return    The Kindergartener's showAndTellItem value
     */
    public String getShowAndTellItem() {
        return showAndTellItem;
    }
    /**
     *  Sets the ID of the Student
     *
     * @param  newShowAndTellItem - The new student's ID value
     */
    public void setShowAndTellItem(String newShowAndTellItem) {
        this.showAndTellItem = newShowAndTellItem;
    }

    /** 
     *  Returns information about the Kindergartener
     *  @return a string containing Kindergartener info.
     */
    @Override
    public String toString() {
        return "Kindergartener {" +
               "showAndTellItem = '" + showAndTellItem + '\'' +
               '}';
    }
}
