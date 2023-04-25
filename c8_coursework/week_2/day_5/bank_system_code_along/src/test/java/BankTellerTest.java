import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class BankTellerTest {

    //declare customer
    BankCustomer customer;
    BankTeller teller;

    @BeforeEach
    public void setUp(){
        //initialise declared above
        customer = new BankCustomer("Richard", LocalDate.of(1879, 10, 15), new BankAccount(500));
        teller = new BankTeller();
    }
    @Test
    public void canMakeWithdrawal(){
        // allow the teller to withdraw and assert that what were getting is correct
        teller.processWithdrawal(customer,300);
        assertThat(customer.getBalance()).isEqualTo(200);
    }
}
