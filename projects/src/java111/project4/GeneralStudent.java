/**
 *  This superclass holds information about a generic Student
 *  For Projet 4 - Part 2
 *  @author Nick Hanson
 *      - Created 11/24/24
 */

 public abstract class GeneralStudent implements TestTaker {
 
    private String studentName;
    private int studentID;

    /**
     *  Gets the name of the Student
     *
     * @return    The student's name value
     */
    public String getStudentName() {
        return studentName;
    }
    /**
     *  Sets the name of the Student
     *
     * @param  newStudentName - The new student's name value
     */
    public void setStudentName(String newStudentName) {
        this.studentName = newStudentName;
    }

    /**
     *  Gets the ID of the Student
     *
     * @return    The student's ID value
     */
    public int getStudentID() {
        return studentID;
    }
    /**
     *  Sets the ID of the Student
     *
     * @param  newStudentID - The new student's ID value
     */
    public void setStudentID(int newStudentID) {
        this.studentID = newStudentID;
    }

    /**
     * Displays a report about the student
     */
    public abstract void studentReport();

    /** 
     *  Returns information about the Student
     *  @return a string containing Student info.
     */
    @Override
    public String toString() {
        return "Student{" +
               "studentID = '" + studentID + '\'' +
               ", studentName = '" + studentName + '\'' +
               '}';
    }

}
