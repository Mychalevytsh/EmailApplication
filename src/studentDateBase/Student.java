package studentDateBase;

import java.io.IOException;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String courses = "";
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
        do {
            System.out.println("Enter course to enroll('Q' to quit)");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance += costOfCourse;

            }else {
                break;
            }

        }
            while (1 != 0);
        System.out.println("ENROLLED IN "+ courses+"\nTUITION BALANCE:"+tuitionBalance);
    }

    //View balance
    public void viewBalance(){
        System.out.println("Your balance: $"+tuitionBalance);
    }

    //Pay tuition
    public void payTuition(){
        System.out.println("Enter how to pay");
        Scanner scan = new Scanner(System.in);
        int payment = scan.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment: $"+ payment);
        viewBalance();
    }

    //Show status
    public String showInfo(){
        return "Name: " + firstName + " " + lastName +
                "\nID: "+ studentId+
                "\nGrade Level:"+gradeYear+
                "\nEnroll:"+ courses +
                "\nBalance: "+ tuitionBalance;
    }
    //Setters




    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

//    @Override
//    public String toString() {
//        String s = this.studentId +"\n"+ this.firstName +"\n"+ this.lastName +"\n";
//
//        return s;
//    }
}
