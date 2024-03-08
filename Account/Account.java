package Account;

public class Account {
    private String name;
    private int balance;
    private String correctPin;
    private int number;


    public int checkBalance(String correctPin){
        return balance;
    }

    private boolean isCorrect(String correctPin){
        if(correctPin.equals(this.correctPin)) return true;
        return false;

    }
    private boolean isInCorrect(String correctPin) {
        return !this.correctPin.equals(correctPin);

    }

    public void deposit(int amount) {
        if (amount < 0) throw new  InvalidAmountException("negative amount deposit not allowed");
        balance += amount;
    }
    public void withdraw(int amount) {
        if (balance < amount) throw new InsufficientFundsException("Insuffient fund");
        balance -= amount;
    }
}







//
//    this.name = name;
//    this.balance = balance;
//    this.pin = pin;
//    this.number = number;
//}
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public void deposit(int deposit) {
//        if (deposit < 0) throw new InvalidAmountException("please put the right amount");
//        this.balance = balance + deposit;
//    }
//
//    public void withdraw(int withdrawAmount, String pin){
//        if (balance < withdrawAmount ) throw new InsufficientFundsException("InsufficientFundsException");
//        this.balance = balance - withdrawAmount;
//
//        }
//
//
//   public void validatePin(String pinEntered){
//        if (pinEntered.length() != 4)
//   }
//
//    public void checkBalance(String pin) {
//
//
//
//
//    }
//}