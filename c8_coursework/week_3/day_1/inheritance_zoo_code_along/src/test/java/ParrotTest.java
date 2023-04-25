import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ParrotTest {

    Parrot parrot;

    @BeforeEach
    void setUp(){
        parrot = new Parrot("Iago");
    }

    @Test
    void canMakeNoise(){
        assertThat(parrot.makeNoise()).isEqualTo("SQUAWK!");
    }

    @Test
    void canEat(){
        assertThat(parrot.eat()).isEqualTo("Mmmm, that was tasty!");
    }

    @Test
    void sayName(){
        assertThat(parrot.name).isEqualTo("Iago");
    }
}
