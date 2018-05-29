public class Diamond {

    Triangle triangle = new Triangle();

    public String drawDiamond(int n) {
        int maxWidth = (n * 2) - 1;

        return triangle.drawIsoscelesTriangle(n) +
                triangle.drawUpsideDownIsoscelesTriangle(n).substring(maxWidth);
    }

    public String drawDiamondWithAName(int n, String name) {
        return (n == 1) ? name: triangle.drawIsoscelesTriangle(n - 1) + "\n" +
                name + "\n" + triangle.drawUpsideDownIsoscelesTriangle(n - 1);
    }
}
