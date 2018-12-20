package studentDateBase;

import java.io.IOException;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String courses = null;
    private int tuitionBalance;
    private String studentId;
    private static int costOfCourse = 600;
    private static int id = 1001;

    //Constructor
    public Student() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter firstName:");
            this.firstName = scanner.nextLine();
        System.out.println("Enter lastName:");
            this.lastName = scanner.nextLine();
        System.out.println("Enter graduate level:\n1 - Freshman\t2 - Saphmore\t3 - Junior\t4 - Senior");
            this.gradeYear = scanner.nextLine();
        setStudentId();
    }

    //Generate an ID
    public void setStudentId() {
        //GradeLevel + ID
        id++;
        this.studentId = gradeYear + id;
    }


    //Enroll in courses
    public void enroll(){
        //Get inside loop while user hits 'Q'
        System.out.println("Enter course to enroll('Q' to quit)");
        Scanner scanner = new Scanner(System.in);
        String course = scanner.nextLine();
        if (!course.equalsIgnoreCase("Q")) {
            courses = courses + "\n"+course;
            tuitionBalance += costOfCourse;
        }
        System.out.println("ENLOLLED IN"+ courses+"\nTUITION BALANCE:"+tuitionBalance);
    }

    //View balance

    //Pay tuition

    //Show status

    //Setters
    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }



    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


}
