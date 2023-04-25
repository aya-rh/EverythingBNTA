import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TigerTest {

    Tiger tiger;

    @BeforeEach
    void setUp(){
        tiger = new Tiger("Khan");
    }

    //use __noArgument when method (canMakeNoise) has more than one use
    @Test
    void canMakeNoise__noArgument(){
        String expected = "MEOW!";
        assertThat(tiger.makeNoise()).isEqualTo(expected);
    }

    // with an argument>>
    @Test
    void canMakeNoise__withArgument(){
        String expected = "In my opinion, Toy Story was overrated.";
        assertThat(tiger.makeNoise("Toy Story was overrated")).isEqualTo(expected);
    }
}
