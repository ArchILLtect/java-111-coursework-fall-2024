/**
 *  This subclass (of GeneralStudent) holds information about an elementary student
 *  For Projet 4 - Part 2
 *  @author Nick Hanson
 *      - Created 11/24/24
 */

public class ElementaryStudent extends GeneralStudent {

    private String favoriteClass;
    private String testGrade;

    /**
     *  Gets the favorite class of the Student
     *
     * @return    The student's favoriteClass value
     */
    public String getFavoriteClass() {
        return favoriteClass;
    }
    /**
     *  Sets the favorite class of the Student
     *
     * @param  newFavoriteClass - The new favoriteClass value
     */
    public void setFavoriteClass(String newFavoriteClass) {
        this.favoriteClass = newFavoriteClass;
    }

    /**
     * Displays a report about the student
     */
    @Override
    public void studentReport() {
        String[] splitName = this.getStudentName().split(" ");
        String firstName = splitName[0];
        System.out.println(this.getStudentName() + "\'s id is " + this.getStudentID() + ". " + firstName
                + "\'s favorite class is " + this.getFavoriteClass() + ". " + firstName + " is taking an"
                + " elementary school test. " + this.getTestResults());
    };

    /**
     * Takes a fake test and gives a grade
     */
    @Override
    public void takeTest() {
        int testScore = (int) (Math.random() * 41) + 60;
        if (testScore > 89 ) {
            testGrade = "n A";
        } else if (testScore > 79 ) {
            testGrade = " B";
        } else if (testScore > 69 ) {
            testGrade = " C";
        } else if (testScore > 59 ) {
            testGrade = " D";
        } else {
            testGrade = " F";
        }

    };

    /**
     * Gets a message about the test results
     * @return test results message
     */
    @Override
    public String getTestResults() {
        String[] splitName = this.getStudentName().split(" ");
        String firstName = splitName[0];
        return firstName + " scored a" + testGrade + " on the test.";
    };

}
