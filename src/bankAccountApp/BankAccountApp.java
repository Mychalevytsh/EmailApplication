package bankAccountApp;

public class BankAccountApp {
    public static void main( String[] args ) {
        //Read real CSV file that create new accounts from this data
        Checkings check = new Checkings("Ivan","56987412",2500);
        Savings sav = new Savings("Petro", "52365899",3200);
        check.showAccountInfo();
        System.out.println("-------------------------------------");
        sav.showAccountInfo();
    }
}
