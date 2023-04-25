import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {

    FizzBuzz fizzbuzz;

    @BeforeEach
    void setUp(){
        fizzbuzz = new FizzBuzz();
    }

    @Test
    void inputDivisibleBy3ReturnsFizz(){
        // arrange - already done in set up

        // act
        String result = fizzbuzz.checkFizzBuzz(3);

        // assert
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void input5ReturnsBuzz(){
        String result = fizzbuzz.checkFizzBuzz(5);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void input6ReturnsFizz(){
        String result = fizzbuzz.checkFizzBuzz(6);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void input10ReturnsBuzz(){
        String result = fizzbuzz.checkFizzBuzz(10);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void input1Returns1AsString(){
        String result = fizzbuzz.checkFizzBuzz(1);
        assertThat(result).isEqualTo("1");
    }

    @Test
    void input29Returns29AsString(){
        String result = fizzbuzz.checkFizzBuzz(29);
        assertThat(result).isEqualTo("29");
    }

    @Test
    void input15ReturnsFizzBuzz(){
        String result = fizzbuzz.checkFizzBuzz(15);
        assertThat(result).isEqualTo("FizzBuzz");
    }



}
