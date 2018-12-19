package emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailCapacity;
    private String alternateEmail;

    //Constructors: firstName and LastName

    public Email( String firstName, String lastName ) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("We create Email for:"+ this.firstName +" "+this.lastName);
    }

    //Ask of department
    private String setDepartment(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set department: \n1 - Sales\n2 - Development\n3 - Accaunting\n0 - Nothing");
        int department = scanner.nextInt();
        if (department == 1) {
            this.department = "sales";
        }else         if (department == 2) {
            this.department = "dev";
        }else if (department == 3) {
            this.department = "accaunt";
        }else if (department == 0){return  "";}


        return this.department;
    }



    //Generate random password
    private String randomPassword(int length){
        String symbolsAvaiable = "abcdefghijklmnopqrstoxyz0123456789!@#$%";
        char [] password  = new char[length];
        for (int i = 0; i <length ; i++) {
            int rand = (int)(Math.random()*symbolsAvaiable.length());
            password[i] = symbolsAvaiable.charAt(rand);
        }
        return new String(password);
    }

    //Set capacity of EmailBox

    //Set alternateEmail


}
