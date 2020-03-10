package Lab;

public class Main {

    public static void main(String[] args) throws InsufficientFunds {

        // creating a new bank account object instance
        BankAccount bankAccount = new BankAccount("0001", 1000.00, Type.CHECKING, "Lionel");

        // getting the owner's name
        System.out.println(bankAccount.getOwner());
        // performing withdraw method that will throw an error if there's an insufficient amount
        bankAccount.withdraw(200.00);
        // getting the balance of the account
        System.out.println(bankAccount.getBalance());
    }

}
