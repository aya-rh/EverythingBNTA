import java.time.LocalDate;

public class BankAccount {

// property
    private double balance;
    // create enum properties
    private AccountType accountType;

//   constructor
    // used to build an object from the class. These objects are often called instances
    // also referred to as 'newing up'.
    // yellow after public indicates constructor
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    // public and private are access modifiers
    // this. used to refer to properties declared in constructor otherwise could class with others named the same
    public void deposit (double amount){
        this.balance += amount;
    }

    public double withdraw (double amount){
        this.balance -= amount;
        return amount;
    }

    // getter and setters - since the properties are private (limiting access to them)
        // not created for everything, case by case
        // we don't want other objects to be able to set the internal balance, so will not provide setter
        // using getter only -> read only
    public double getBalance(){
        return balance;
    }
    //    public void setBalance(double balance) {
    //        this.balance = balance;
    //    }

    public AccountType getaccountType(){
        return accountType;
    }

}



// can have multiple classes in one but better not to
// can't be public if in same file
