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

    @Test
    void drawIsoscelesTriangleInOneLine() {
        assertEquals("*", triangle.drawIsoscelesTriangle(1));
    }

    @Test
    void drawIsoscelesTriangleInTwoLines() {
        assertEquals(" *\n***", triangle.drawIsoscelesTriangle(2));
    }

    @Test
    void drawIsoscelesTriangleWithThreeLines() {
        assertEquals("  *\n ***\n*****",
                triangle.drawIsoscelesTriangle(3));
    }

    @Test
    void drawIsoscelesTriangleWithFiveLines() {
        assertEquals("    *\n   ***\n  *****\n *******\n*********",
                triangle.drawIsoscelesTriangle(5));
    }

    @Test
    void drawUpsideDownIsoscelesTriangleWithOneLine() {
        assertEquals("*", triangle.drawUpsideDownIsoscelesTriangle(1));
    }

    @Test
    void drawUpsideDownIsoscelesTriangleWithTwoLines() {
        assertEquals("***\n *", triangle.drawUpsideDownIsoscelesTriangle(2));
    }

    @Test
    void  drawUpsideDownIsoscelesTriangleWithFiveLines() {
        assertEquals("*********\n *******\n  *****\n   ***\n    *",
                triangle.drawUpsideDownIsoscelesTriangle(5));
    }



}
