import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ChickenTest {

    Chicken chicken;

//---------Testing
    @BeforeEach
    public void setUp(){
        chicken = new Chicken("Ginger", 5);
    }

    @Test
    public void hasEggs(){
        assertThat(chicken.getEggs()).isEqualTo(5);
    }

    @Test
    public void setEggs(){
        chicken.setEggs(3);
        assertThat(chicken.getEggs()).isEqualTo(3);
    }
}
