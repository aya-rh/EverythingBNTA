import java.time.LocalDate;

public class BankCustomer {
    private String name;
    private LocalDate dob;
    private BankAccount account;
        //we created this class above and can use it in this new class
        // would usually create on different page

    public BankCustomer(String name, LocalDate dob, BankAccount account){
            this.name = name;
            this.dob = dob;
            this.account = account;
            //put these in parameters above in initial constructor line
        }
    public double getBalance(){
        return account.getBalance();
    }

    public void withdraw(double amount){
        account.withdraw(amount);
    }

    public void deposit(double amount){
        account.deposit(amount);
    }

        // getters only for name and dob since they're read only
    public String getName(){
        return name;
    }
    public LocalDate getDob(){
        return dob;
    }

    public AccountType getAccountType(){
        return account.getaccountType();
    }

    }
