import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {
    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }
    @Test
    void canAdd(){
        var calc = new Calculator(); // use if you don't create and initialise it as a local calc in class
        assertThat(calc.add(3L,2L)).isEqualTo(5L);
    }

    @Test
    void canSubtract(){
        var calc = new Calculator();
        assertThat(calc.subtract(4L, 3L)).isEqualTo(1L);
    }

    // Test driven development (TDD)
    // you write the test first to establish a criteria for success before creating the solution


    // To sum an array
    @Test
    void canSumArray(){
        // 'var' uses 'type inference' (variable is type Calculator - infers it for you)
        Long[] arr = {10L, 5L, 2L};

        // assertThat(actual).isEqualTo(expected);
        // breakdown:
//        Long actual = calc.sumArray(arr);
//        Long expected = 17L;
//        assertThat(actual).isEqualTo(17L);

        assertThat(calc.sumArray(arr)).isEqualTo(17L);
        // this line does the same as what the last 3 lines do.
        // split into three lines to explain and demonstrate what it does.
    }


    @Test
    void productOfArray(){
        // find product of all numbers in array and return as Long
        // calc will be red until you create a calc for it

        assertThat(calc.productOfArray(new Long[]{2L, 4L, 6L, 8L})).isEqualTo(384);

    }
}
