/**
 *  This superclass holds information about a generic Student
 *  For Projet 4 - Part 1
 *  @author Nick Hanson
 *      - Created 11/24/24
 */

public class Student {
    
    private int studentID;
    private String studentName;
    private String schoolName;
    private String extraActivities;
    private String homeroomTeacher;

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
     *  Gets the name of the Student's school
     *
     * @return    The student's school name value
     */
    public String getSchoolName() {
        return schoolName;
    }
    /**
     *  Sets the name of the Student's school
     *
     * @param  newSchoolName - The new student's school name value
     */
    public void setSchoolName(String newSchoolName) {
        this.schoolName = newSchoolName;
    }

    /**
     *  Gets the extra curricular activities of the Student
     *
     * @return    The student's extra curricular activites value
     */
    public String getExtraActivities() {
        return extraActivities;
    }
    /**
     *  Sets the extra curricular activities of the Student
     *
     * @param  newExtraActivites - The new student's extra curricular activites value
     */
    public void setExtraActivities(String newExtraActivites) {
        this.extraActivities = newExtraActivites;
    }

    /**
     *  Gets the name of the homeroom teacher of the Student
     *
     * @return    The student's homeroom teacher value
     */
    public String getHomeroomTeacher() {
        return homeroomTeacher;
    }
    /**
     *  Sets the name of the homeroom teacher of the Student
     *
     * @param  newHomeroomTeacher - The new student's homeroom teacher's name value
     */
    public void setHomeroomTeacher(String newHomeroomTeacher) {
        this.homeroomTeacher = newHomeroomTeacher;
    }

    /** 
     *  Returns information about the Student
     *  @return a string containing Student info.
     */
    @Override
    public String toString() {
        return "Student{" +
               "studentID = '" + studentID + '\'' +
               ", studentName = '" + studentName + '\'' +
               ", schoolName = '" + schoolName + '\'' +
               ", extraActivities = '" + extraActivities + '\'' +
               ", homeroomTeacher = '" + homeroomTeacher + '\'' +
               '}';
    }

}
