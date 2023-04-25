import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FarmerTest {

    Farmer farmer;

    @BeforeEach
    void setUp(){
        farmer = new Farmer("Phil");
    }

    @Test
    void hasCollectedEggs(){
        assertThat(farmer.getCollectedEggs()).isEqualTo(0);
    }

    @Test
    void canCollectEggs(){
        // arrange
        Farm farm = new Farm("Cohort 8 Farm");
        Chicken Ginger = new Chicken("Ginger", 5);
        Chicken Daisy = new Chicken("Daisy", 2);
        Chicken Henrietta = new Chicken("Henrietta", 0);

        // act
        farm.addChicken(Ginger);
        farm.addChicken(Daisy);
        farm.addChicken(Henrietta);

        // assert
        farmer.collectEggs(farm);
        assertThat(farmer.getCollectedEggs()).isEqualTo(7);
    }
}
