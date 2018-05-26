import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineTest {

    Line line;

    @BeforeEach
    void init() {
        line = new Line();
    }

    @Test
    void drawOneAsterisk() {
        assertEquals(line.drawDot(),"*");
    }

    @Test
    void drawHorizontalLineWithOneAsterisk() {
        assertEquals(line.drawHorizontalLine(1), "*");
    }

    @Test
    void drawHorizontalLineWithTwoAsterisks() {
        assertEquals(line.drawHorizontalLine(2), "**");
    }

    @Test
    void drawVerticalLineWithOneAsterisk() {
        assertEquals(line.drawVerticalLine(1), "*");
    }

    @Test
    void drawVerticalLineWithTwoAsterisks() {
        assertEquals(line.drawVerticalLine(2), "*\n*");
    }
}
