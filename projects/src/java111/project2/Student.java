/** This class represents a Student.
 * This class is part 1 of Project 2 Part 1
 *  
 *  @author Nick Hanson
 *  - Created on: October 5, 2024
*/
public class Student {
    
    private String studentName;
    private int studentID = 9999999;
    private int creditHours = 36;
    private int gradePoints = 100;

    // The following methods are public getters and setters for each instance variable
    /** Getter method to access the full name of the student
     * @return full name of student
    */
    public String getStudentName() {
        return this.studentName;
    }
    /** Setter method to modify the full name of the student
     * @param newName full name of student
    */
    public void setStudentName(String newName) {
        this.studentName = newName;
    }

    /** Getter method to access the student's ID number
     * @return student's ID number
    */
    public int getStudentID() {
        return this.studentID;
    }
    /** Setter method to modify the student's ID number
     * @param newStudentID ID number for this student
    */
    public void setStudentID(int newStudentID) {
        this.studentID = newStudentID;
    }

    /** Getter method to access the number of total credit hours the student has
     * @return number of total credit hours student has
    */
    public int getCreditHours() {
        return this.creditHours;
    }
    /** Setter method to modify the number of total credit hours the student has
     * @param newCreditHours number of credit hours for this student
    */
    public void setCreditHours(int newCreditHours) {
        this.creditHours = newCreditHours;
    }

    /** Getter method to access the number of grade points the student has
     * @return number of grade points student has
    */
    public int getGradePoints() {
        return this.gradePoints;
    }
    /** Setter method to modify the number of grade points the student has
     * @param newGradePoints number of grade points for this student
    */
    public void setGradePoints(int newGradePoints) {
        this.gradePoints = newGradePoints;
    }

    /** Calculates and returns the GPA for a student
     *  @returns the GPA for the student
     */
    public double calculateGPA() {
        return (double) gradePoints / creditHours;
    }

    /** This method returns a String containing all of the student's information,
     *
     * @returns all student's information
    */
    public String display() {
        String studentInfo = "Student " + studentName + ", ID# " + studentID +
                ", has " + creditHours + " credit hours and " + gradePoints + 
                " grade points, resulting in a GPA of " + String.format("%.3f", calculateGPA());
        return studentInfo;
    }
}
