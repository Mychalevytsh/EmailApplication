package emailApp;

public class EmailApp {
    public static void main( String[] args ) {
        Email email1 = new Email("Ivan","Pavluk");

        email1.setEmailCapacity(500);

        System.out.println("PASSWORD:"+email1.getPassword());

        System.out.println(email1.getEmail());
        System.out.println(email1.showInfo());
    }
}
