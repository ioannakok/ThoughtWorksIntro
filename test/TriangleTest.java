import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    Triangle triangle;

    @BeforeEach
    void init() {
        triangle = new Triangle();
    }

    @Test
    void drawRightTriangleWithBaseOneAsterisk() {
        assertEquals("*", triangle.drawRightTriangle(1));
    }

    @Test
    void drawRightTriangleWithBaseTwoAsterisks() {
        assertEquals("*\n**", triangle.drawRightTriangle(2));
    }

    @Test
    void drawRightTriangleWithBaseFiveAsterisks() {
        assertEquals("*\n**\n***\n****\n*****",
                triangle.drawRightTriangle(5));
    }


}
