/**
 *  This subclass (of GeneralStudent) holds information about a middle school student
 *  For Projet 4 - Part 2
 *  @author Nick Hanson
 *      - Created 11/24/24
 */

public class MiddleSchooler extends GeneralStudent {

    private String studentLockerNumber;
    private String testGrade;

    /**
     *  Gets the Student's locker number value
     *
     * @return    The Student's locker number value
     */
    public String getStudentLockerNumber() {
        return studentLockerNumber;
    }
    /**
     *  Sets the Student's locker number value
     *
     * @param  newStudentLockerNumber - The new studentLockerNumber value
     */
    public void setStudentLockerNumber(String newStudentLockerNumber) {
        this.studentLockerNumber = newStudentLockerNumber;
    }

    /**
     * Displays a report about the student
     */
    @Override
    public void studentReport() {
        String[] splitName = this.getStudentName().split(" ");
        String firstName = splitName[0];
        System.out.println(this.getStudentName() + "\'s id is " + this.getStudentID() + ". " + firstName
                + "\'s locker number is " + this.getStudentLockerNumber() + ". " + firstName + " is taking a"
                + " middle school test. " + this.getTestResults());
    };

    /**
     * Takes a fake test and gives a grade
     */
    public void takeTest() {
        int testScore = (int) (Math.random() * 41) + 60;
        if (testScore > 89 ) {
            testGrade = "A";
        } else if (testScore > 79 ) {
            testGrade = "B";
        } else if (testScore > 69 ) {
            testGrade = "C";
        } else if (testScore > 59 ) {
            testGrade = "D";
        } else {
            testGrade = "F";
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
        return firstName + " scored an " + testGrade + " on the test.";
    };

}
