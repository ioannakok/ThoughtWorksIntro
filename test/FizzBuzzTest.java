import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzzConverter;

    @BeforeEach
    void init() {
        fizzBuzzConverter = new FizzBuzz();
    }

    @Test
    void returnsOne() {
        assertEquals("1", fizzBuzzConverter.convertToFizzBuzz(1));
    }

    @Test
    void returnsTwo() {
        assertEquals("2", fizzBuzzConverter.convertToFizzBuzz(2));
    }

    @Test
    void returnsFizzForNumbersDivisibleByThree() {
        assertEquals("Fizz", fizzBuzzConverter.convertToFizzBuzz(3));
    }

    @Test
    void returnsBuzzForNumbersDivisibleByFive() {
        assertEquals("Buzz", fizzBuzzConverter.convertToFizzBuzz(5));
    }

    @Test
    void returnsFizzBuzzForNumbersDivisibleByBothThreeAndFive() {
        assertEquals("FizzBuzz", fizzBuzzConverter.convertToFizzBuzz(15));
    }
}
