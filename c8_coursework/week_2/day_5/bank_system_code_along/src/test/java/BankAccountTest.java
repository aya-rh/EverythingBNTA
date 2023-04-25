import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    BankAccount account;

    @BeforeEach
    public void setUp(){
        account = new BankAccount(500);
    }
    @Test
    public void canGetBalance(){
        assertThat(account.getBalance()).isEqualTo(500);
    }

}
