import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTest {

    Diamond diamond;

    @BeforeEach
    void init() {
        diamond = new Diamond();
    }

    @Test
    void drawDiamondWithDiagonalOne() {

        assertEquals("*\n", diamond.drawDiamond(1));
    }

    @Test
    void drawDiamondWithDiagonalFive() {
        assertEquals("  *\n ***\n*****\n ***\n  *\n",
                diamond.drawDiamond(3));
    }

    @Test
    void drawDiamondWithDiagonalNine() {
        assertEquals("    *\n   ***\n  *****\n *******\n*********\n " +
                        "*******\n  *****\n   ***\n    *\n",
                diamond.drawDiamond(5));
    }

    @Test
    void drawDiamondWithNameWithDiagonalOne() {
        assertEquals("Ioanna\n",
                diamond.drawDiamondWithAName(1, "Ioanna"));
    }

    @Test
    void drawDiamondWithNameWithDiagonalTwo() {
        assertEquals("*\nIoanna\n*\n",
                diamond.drawDiamondWithAName(2, "Ioanna"));
    }

    @Test
    void drawDiamondWithNameWithDiagonalThree() {
        assertEquals(" *\n***\nIoanna\n***\n *\n",
                diamond.drawDiamondWithAName(3, "Ioanna"));
    }
}
