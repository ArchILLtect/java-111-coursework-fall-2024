import java.util.ArrayList;
/**
 *  This is the GeneralStudentEnroller class which holds student 
 *  objects and displays their information
 *  For Projet 4 - Part 2
 *  @author Nick Hanson
 *      - Created 11/24/24
 */

public class GeneralStudentEnroller {
    
    private  InputHelper                input;
    private  ArrayList<GeneralStudent>  students;

    /**
     *  This method gets the students
     */
    public void studentEnroll() {

        students    = new ArrayList<GeneralStudent>();
        input       = new InputHelper();

        String              studentType         = "";
        String              studentIDString     = "";
        String              studentName         = "";
        String              favoriteClass       = "";
        String              lockerNumber        = "";
        String              graduationPlans     = "";
        int                 studentID           = 0;
        String              moreStudents        = "";
        ElementaryStudent   newElemStudent      = null;
        MiddleSchooler      newMiddleSchooler   = null;
        HighSchooler        newHighSchooler     = null;

        while (true) {
            studentType = input.getUserInput(
                    "Please choose the type of the student to enroll (H for High School, M for "
                            + "Middle School, E for Elementary): ");
            studentName = input.getUserInput(
                    "Please enter the student's name: ");
            studentIDString = input.getUserInput(
                    "Please enter the student's ID: ");
            studentID = Integer.parseInt(studentIDString);
            if (studentType.equals("e") || studentType.equals("E")) {
                favoriteClass = input.getUserInput(
                        "Please enter the student's favorite class: ");
                newElemStudent = new ElementaryStudent();
                newElemStudent.setStudentName(studentName);
                newElemStudent.setStudentID(studentID);
                newElemStudent.setFavoriteClass(favoriteClass);
                newElemStudent.takeTest();
                students.add(newElemStudent);
            } else if (studentType.equals("m") || studentType.equals("M")) {
                lockerNumber = input.getUserInput(
                        "Please enter the student's locker number: ");
                newMiddleSchooler = new MiddleSchooler();
                newMiddleSchooler.setStudentName(studentName);
                newMiddleSchooler.setStudentID(studentID);
                newMiddleSchooler.setStudentLockerNumber(lockerNumber);
                newMiddleSchooler.takeTest();
                students.add(newMiddleSchooler);
            } else if (studentType.equals("h") || studentType.equals("H")) {
                graduationPlans = input.getUserInput(
                        "Please enter the student's after-graduation plans: ");
                newHighSchooler = new HighSchooler();
                newHighSchooler.setStudentName(studentName);
                newHighSchooler.setStudentID(studentID);
                newHighSchooler.setAfterGradPlans(graduationPlans);
                newHighSchooler.takeTest();
                students.add(newHighSchooler);
            } else {
                System.out.println("ERROR - Please select a valid option");
            }
            moreStudents = input.getUserInput(
                    "Would you like to add another student?");
            if (!moreStudents.equals("y") && !moreStudents.equals("Y")) {
                break;
            }
        }
    }

    /**
     *  This method calls the strudentReport() method for each student
     */
    public void displayReports() {
        for (GeneralStudent student : students) {
            student.studentReport();
        }
    }

    /**
     *  This methods initializes the app
     */
    public void run() {
        studentEnroll();
        System.out.println();
        System.out.println("Here are the student reports:");
        System.out.println();
        displayReports();
    }
}
