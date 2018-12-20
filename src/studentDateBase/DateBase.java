package studentDateBase;

import java.util.Scanner;

public class DateBase {
    public static void main( String[] args ) throws Exception {

        //Ask how many student we should to add
        System.out.println("Enter how many students you want to enter?");
        Scanner scan = new Scanner(System.in);
        int numberOfStudent = scan.nextInt();
        //Create array of Students
        Student [] students = new Student[numberOfStudent];

        for (int i = 0; i <numberOfStudent ; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();

        }

        //Show information about all students
        for(Student s: students){
            System.out.println(s.showInfo());
        }

    }
}
