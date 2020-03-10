package Lab;

public class BankAccount {

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Type getAccountType() {
        return accountType;
    }

    public BankAccount(String pin, double balance, Type accountType, String owner) {
        this.pin = pin;
        this.balance = balance;
        this.accountType = accountType;
        this.owner = owner;
    }

    public void setAccountType(Type accountType) {
        this.accountType = accountType;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // what  does a bank account have?
    // pin
    private String pin;
    // balance
    private double balance;
    // account type
    private Type accountType;
    // owner/user
    private String owner;

    // what are the actions you can do with a bank account?

    // cry
    public String doCry(){
        return "This is sad.";
    }

    // withdraw
    public void withdraw(double amount) throws InsufficientFunds {
        // business logic

        // try block for error handling
        try {
            // conditional to check to see if we have enough in our balance
            if (balance - amount < 0){
                throw new InsufficientFunds();
            } else {
                // actualy business logic that we want to reach
                balance = balance - amount;
            }
        } catch (InsufficientFunds e){
            // printing the error to the console
            e.printStackTrace();

        }
    }


    // deposit
    public void deposit(double amount){
        // business logic
        balance = balance + amount;
    }

    // check balance
    public double getBalance(){
        return balance;
    }


}
