package emailApp;

public class EmailApp {
    public static void main( String[] args ) {
        Email email1 = new Email("Ivan","Pavluk");

        System.out.println(email1.getFirstName() + email1.getDepartment());
    }
}
