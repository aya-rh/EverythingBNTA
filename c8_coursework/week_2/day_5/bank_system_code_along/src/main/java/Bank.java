import java.time.LocalDate;

public class Bank {
    private BankCustomer customer;
    private BankTeller teller;

        // public static void main, is the kickstarter to the application
        // only need one
    public static void main(String[] args) {
            new Bank();
        }

        //constructor
        // default to package level
    public Bank () {
            // when we used the 'new' keyword, we're calling the constructor on the class
        BankAccount account = new BankAccount(500);
        BankCustomer customer = new BankCustomer("Greg", LocalDate.of(1998, 7, 13), account);
            //one-to-one relationship, used account declared above in the parameters
            // called newing up
            // can just not include the first name and include '500' in the parameters of second line
            // that way you can create more than one customer

//        System.out.println(customer.getBalance());
//        customer.deposit(customer.getBalance());
//        System.out.println(customer.getBalance());
//        System.out.println(customer.getDob());

        BankCustomer customer2 = new BankCustomer("Colin", LocalDate.of(1986, 5, 12), new BankAccount(200));
        teller = new BankTeller();
        teller.processDeposit(customer, 400);
        teller.processDeposit(customer2, 2500);
        System.out.println(customer.getBalance());
        System.out.println(customer2.getBalance());

        }
    }
