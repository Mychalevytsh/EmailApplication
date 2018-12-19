package emailApp;

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
