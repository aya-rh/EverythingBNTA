import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SeagullTest {

    Seagull seagull;

    @BeforeEach
    void setUp(){
        seagull = new Seagull("Steve");
    }

    @Test
    void canMakeNoise(){
        assertThat(seagull.makeNoise()).isEqualTo("MINE!");
    }

    @Test
    void canLayEgg(){
        assertThat(seagull.layEgg()).isEqualTo("I've laid an egg!");
    }
}
