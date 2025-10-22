public class BankAccount {
    int accountNumber;
    int balance;
    static String bankName;
    static float interestRate;


    // Constructor
    BankAccount(int number, int bl){
        accountNumber = number;
        balance = bl;
    }
    // Static Method Set
    public static void setInterestR(float value){
        interestRate = value;
    }

    public static void setBankName(String value){
        bankName = value;
    }


    // Static Method Get
    public static float getInterestR(){
        return interestRate;
    }

    public static String getBankName(){
        return bankName;
    }


    public static void main(String args[]){

        String name = new String("HBL");
        BankAccount.setBankName(name);
        BankAccount.setInterestR(12);


        // Object 1
        BankAccount obj1 = new BankAccount(111,1000);
        System.out.println("Object 1 Account Number:"+obj1.accountNumber);
        System.out.println("Object 1 Balance:"+obj1.balance);
        System.out.println("Object 1 Bank Name:"+BankAccount.getBankName());
        System.out.println("Object 1 Bank's Interest Rate:"+BankAccount.getInterestR());

        // Object 2
        BankAccount obj2 = new BankAccount(112,2000);
        System.out.println("Object 2 Account Number:"+obj2.accountNumber);
        System.out.println("Object 2 Balance:"+obj2.balance);
        System.out.println("Object 1 Bank Name:"+BankAccount.getBankName());
        System.out.println("Object 1 Bank's Interest Rate:"+BankAccount.getInterestR());
    }
}
