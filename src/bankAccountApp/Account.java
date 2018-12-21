package bankAccountApp;

public abstract class Account implements IBaseRate {
    //list common properties
    String name;
    String sSN;
    double balance;

    static int index = 10000;
    String accountNumber;
    double rate;



    //Constructors
        public Account(String name, String sSN, double initDeposit){
            this.name = name;
            this.sSN = sSN;
            this.balance = initDeposit;

            setRate();

            //Set account number
            index++;
            this.accountNumber = setAccountNumber();


        }

    private String setAccountNumber() {
            String lessTwoOfSSN = sSN.substring(sSN.length()-2,sSN.length());
            int uniqueID = index;
            int randomNumber = (int)(Math.random()*Math.pow(10,3));
        return lessTwoOfSSN + uniqueID + randomNumber;
    }

    public abstract void setRate ();

        //Transactions methods
    public void deposit (double amount){
            balance = balance + amount;
            System.out.println("Teposting : $" + amount);
        }

    public void withdraw (double amount){
        balance = balance - amount;
        System.out.println("Withdrawing : $" + amount);
    }

    public void transfer (double amount, double toWhere){
        balance = balance - amount;
        System.out.println("Transfering : $" + amount + "  to " + toWhere);
    }

    public void printBalance(){
        System.out.println("Your Balance is now:  " + balance);
    }

    public void showAccountInfo (){

                 System.out.println(
                        "NAME: " + name+
                        "\nACCOUNT NUMBER: " + accountNumber +
                        "\nBALANCE: " + balance +
                                "\nRATE: " + rate +"%"
                            );
    }
}
