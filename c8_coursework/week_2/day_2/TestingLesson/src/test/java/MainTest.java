import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainTest {
    // Annotation - special type of class, used to label a method as a testable method '@'

    @Test
    void myFirstTest() {
        assertThat(1).isEqualTo(1);
//        passes because it's true, will give error if false
    }

}
