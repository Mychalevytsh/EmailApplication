package bankAccountApp;

public  class Checkings extends Account {
    //List properties  specific to Checking accounts
    private int debitCardNumber;
    private int debitCardPIN;


    //Constructors specific to initialize Checking accounts properties
    public Checkings(String name, String sSN, double initDeposit ){
        super(name, sSN, initDeposit);
        accountNumber = "2"+accountNumber;
        setDebitCard();


    }

    public void setRate(){
        rate = getBaseRate() * .15;
    }

    //List of parameters specific to Checking accounts
    private  void setDebitCard(){
        debitCardNumber = (int)(Math.random()*Math.pow(10,12));
        debitCardPIN = (int)(Math.random()*Math.pow(10,4));
    }

    @Override
    public void showAccountInfo() {
        super.showAccountInfo();
        System.out.println("CHECKING ACCOUNT FEATURES: " +
                "\nDEBIT_CARD_NUMBER: " +  debitCardNumber +
                "\nDEBIT_CARD_PIN: " + debitCardPIN
                );
    }
}
