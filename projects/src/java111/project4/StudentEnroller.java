import java.util.ArrayList;
/**
 *  This is the StudentEnroller class which holds Student 
 *  objects and displays their information
 *  
 * @author    Nick Hanson
 *     - Created 11/24/24
 */


public class StudentEnroller {

    // Declare a new arraylist
    private ArrayList<Student> students;

    /**
     *  This method sets up the students
     */
    public void studentEnroll() {

        // Instantiate the array list
        students = new ArrayList<>();

        // Instantiate four new students
        Student         studentOne      = new Student();
        Student         studentTwo      = new Student();
        Kindergartener  studentThree    = new Kindergartener();
        Kindergartener  studentFour     = new Kindergartener();

        // Set each student data
        studentOne.setStudentID(12482);
        studentOne.setStudentName("Kia Y.");
        studentOne.setSchoolName("Wilson Elementary School");
        studentOne.setHomeroomTeacher("Mr. Abiodun");
        studentOne.setExtraActivities("soccer");

        studentTwo.setStudentID(2039);
        studentTwo.setStudentName("Emilia Xiong");
        studentTwo.setSchoolName("Coolidge Elementary School");
        studentTwo.setHomeroomTeacher("Ms. Jelinski");
        studentTwo.setExtraActivities("debate");

        studentThree.setStudentID(5);
        studentThree.setStudentName("Finley Kapinski");
        studentThree.setSchoolName("Everyone Is Special Kindergarten");
        studentThree.setHomeroomTeacher("Miss McGreevy");
        studentThree.setExtraActivities("sculpting");
        studentThree.setShowAndTellItem("snails");

        studentFour.setStudentID(221);
        studentFour.setStudentName("Quinn Q.");
        studentFour.setSchoolName("Pine View");
        studentFour.setHomeroomTeacher("Mr. Tomczak");
        studentFour.setExtraActivities("detention");
        studentFour.setShowAndTellItem("a snake");

        // Add each student to the arraylist
        students.add(studentOne);
        students.add(studentTwo);
        students.add(studentThree);
        students.add(studentFour);

    }

    /**
     *  This methods displays each student's information
     */
    public void displayStudents() {
        System.out.println();
        // Iterate through each student
        for (Student student : students) {
            // Check if student is a Kindergartener and display show and tell message if true
            if (student instanceof Kindergartener) {
                // Need to cast these Students as Kindergarteners to have access to getShowAndTellItem method
                Kindergartener kinderStudent = (Kindergartener) student;
                System.out.println(student.getStudentName() + " is a Kindergarten Student and brought "
                        + kinderStudent.getShowAndTellItem() + " for show-and-tell.")
            ;
            }
            System.out.println(student.getStudentName() + "'s ID is " + student.getStudentID() + ".");
            System.out.println(student.getStudentName() + "'s homeroom teacher at " + student.getSchoolName()
                    + " is " + student.getHomeroomTeacher() + ".")
            ;
            System.out.println(student.getStudentName() + "'s extracurricular activities include "
                    + student.getExtraActivities() + ".")
            ;
            System.out.println();
        }
    }

    /**
     *  This methods initializes the app
     */
    public void run() {
        studentEnroll();
        displayStudents();
    }
}
