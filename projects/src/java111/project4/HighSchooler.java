/**
 *  This subclass (of GeneralStudent) holds information about a high school student
 *  For Projet 4 - Part 2
 *  @author Nick Hanson
 *      - Created 11/24/24
 */

public class HighSchooler extends GeneralStudent {

    private String afterGradPlans;
    private String testGrade;

    /**
     *  Gets the after graduation plan's of the Student
     *
     * @return    The student's plan's after graduation
     */
    public String getAfterGradPlans() {
        return afterGradPlans;
    }
    /**
     *  Sets the favorite class of the Student
     *
     * @param  newAfterGradPlans - The new afterGradPlans value
     */
    public void setAfterGradPlans(String newAfterGradPlans) {
        this.afterGradPlans = newAfterGradPlans;
    }

    /**
     * Displays a report about the student
     */
    @Override
    public void studentReport() {
        String[] splitName = this.getStudentName().split(" ");
        String firstName = splitName[0];
        System.out.println(this.getStudentName() + "\'s id is " + this.getStudentID() + ". " + firstName
                + "\'s plans to " + this.getAfterGradPlans() + " after graduation. " + firstName + " is taking a"
                + " high school test. " + this.getTestResults());
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
