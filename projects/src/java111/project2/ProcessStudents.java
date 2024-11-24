/** This class processes Students.
 * This class is part 2 of Project 2 Part 1
 *  
 *  @author Nick Hanson
 *  - Created on: October 5, 2024
*/
public class ProcessStudents {
    
    //This instance variable sets up an array that will hold students
    private Student[] students;

    /** This method an array of three Student object references, assigns it
     * to the instance variable reference, instantiates the 3 students -
     * assigning them to the array, and assigns values for all the students
    */
    public void createStudents() {
        students = new Student[3];

        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();

        students[0].setStudentName("Kendra Swift");
        //students[0].setStudentID(); Not using the setter keep it at default
        //students[0].setCreditHours(); Not using the setter keep it at default
        //students[0].setGradePoints(); Not using the setter keep it at default

        students[1].setStudentName("Zean Hill");
        students[1].setStudentID(748128);;
        students[1].setCreditHours(40);
        students[1].setGradePoints(120);

        students[2].setStudentName("Abelina Gilbert");
        students[2].setStudentID(938783);
        students[2].setCreditHours(30);
        students[2].setGradePoints(110);
    }

    /** This method loops through each student and runs
     * the display method for each
    */
    public void displayStudents() {
        for (int counter = 0; counter < students.length; counter++) {
            System.out.println(students[counter].display());
        }
    }

    // This method creates the individaul students and then displays them
    public void runStudentProcessing() {
        createStudents();
        displayStudents();
    }
}
