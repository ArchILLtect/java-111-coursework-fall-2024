/**
 *   This Student sub class holds information about a Kindergartener
 *
 *   @author Nick Hanson
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
