package bankAccountApp;

public  class Savings extends Account{
    //List properties for specific to Savings accounts
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;


    //Constructors specific to Savings accounts
        public Savings (String name, String sSN, double initDeposit ){
           super(name, sSN, initDeposit);
            accountNumber = "1"+accountNumber;
            setSafetyDepositBox();

            }

    public void setRate(){
        rate = getBaseRate() * .25;
    }

        private void setSafetyDepositBox (){
            safetyDepositBoxID = (int)(Math.random()*Math.pow(10,3));
            safetyDepositBoxKey = (int)(Math.random()*Math.pow(10,4));
        }

    //List of parameters specific to Savings accounts
    @Override
    public void showAccountInfo() {
        super.showAccountInfo();
        System.out.println("SAVING ACCOUNT FEATURES: "+
                "" + safetyDepositBoxID +
                "\nSAFETY_DEPOSIT_BOX_KEY:" + safetyDepositBoxKey
                );

    }


}
