import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FarmTest {

    Farm farm;
    Chicken chicken;

    @BeforeEach
    void setUp(){
        farm = new Farm("Cohort 8 Farm");
        chicken = new Chicken("Ginger", 5);
    }

    @Test
    void canCountChickens(){
        assertThat(farm.countChickens()).isEqualTo(0);
    }

    @Test
    void canAddChickens(){
        farm.addChicken(chicken);
        assertThat(farm.countChickens()).isEqualTo(1);
    }

    // will give error if you don't add a chicken first to test it
    @Test
    void canRemoveChicken(){
        farm.addChicken(chicken);
        farm.removeChicken();
        assertThat(farm.countChickens()).isEqualTo(0);
    }
}
