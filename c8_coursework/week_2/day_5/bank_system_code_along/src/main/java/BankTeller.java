public class BankTeller {
        // a class that only allows read only access
        // a class that is assigned the tasks, doesn't have a state
        // "a service class"
     public void processDeposit(BankCustomer customer, double amount){
            customer.deposit(amount);

     }
     public void processWithdrawal(BankCustomer customer, double amount){
            customer.withdraw(amount);
     }

     public void applyInterest(BankCustomer customer){
         if (customer.getAccountType().equals(AccountType.SAVINGS)) {
             customer.deposit(customer.getBalance() * 0.05);
         }
         else {
             customer.deposit(customer.getBalance() * 0.02);
         }
     }
    }
