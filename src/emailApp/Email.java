package emailApp;

import java.io.IOException;
import java.util.Scanner;

public class Email {
    private  int defaultPasswordSize = 10;
    private  int defaultMailCapacity = 500;
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailCapacity;
    private String alternateEmail;
    private String companySuffix = "uges.utg.com";

    //Constructors: firstName and lastName
    public Email( String firstName, String lastName ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = randomPassword(defaultPasswordSize);
        System.out.println("We create Email for:"+ this.firstName +" "+this.lastName);
    }

    //overload toString method
       public String getEmail() {
         email = firstName.toLowerCase()+ "."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
       return email;
    }

    //Ask of department
    private String setDepartment (){

        int department = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set department: \n1 - Sales\n2 - Development\n3 - Accaunting\n4 - Nothing");
        try {
            department = scanner.nextInt();
            throw new IOException();
        }catch (IOException e){
            System.out.println(e.getMessage());
            System.out.println("Type correct Number");
        }

        if (department == 1) {
            this.department = "sales";
        }else         if (department == 2) {
            this.department = "dev";
        }else if (department == 3) {
            this.department = "accaunt";
        }else if (department == 4){return  "";}

        return this.department;
    }



    //Generate random password
    private String randomPassword(int length){
        String symbolsAvaiable = "ABCDEFGHIJKLMOPQRSTOXYZabcdefghijklmnopqrstoxyz0123456789!@#$%";
        char [] password  = new char[length];
        for (int i = 0; i <length ; i++) {
            int rand = (int)(Math.random()*symbolsAvaiable.length());
            password[i] = symbolsAvaiable.charAt(rand);
        }
        return new String(password);
    }

    //change password
    public void changePassword( String password ){
        this.password = password;
    }

    //Set capacity of EmailBox
     public void setEmailCapacity( int capacity ){
        this.mailCapacity = capacity;
    }

    //Set alternateEmail
    public void setAlternateEmail( String altEmail ) {
        this.alternateEmail = altEmail;
    }

    //GETTERS
    public int getMailCapacity() {
        return mailCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public String getPassword() {
        return password;
    }


    public String showInfo() {

        return "DISPLAY NAME: "+ firstName + " "+ lastName + "\nCOMPANY EMAIL: "+ getEmail()+ "\nMAIL_BOX_CAPACITY: "+mailCapacity+" mb";
    }
}
