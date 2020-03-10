package Lab;

public class InsufficientFunds extends Exception {

    public InsufficientFunds() {
        super("This account does not have enough money! Please stop!");
    }
}
