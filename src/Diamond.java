public class Diamond {

    Triangle triangle = new Triangle();

    public String drawDiamond(int n) {
        int maxWidth = (n * 2) - 1;
        String isoscelesTriangle = triangle.drawIsoscelesTriangle(n);

        return isoscelesTriangle.substring(0,
                isoscelesTriangle.length() - 1) +
                triangle.drawUpsideDownIsoscelesTriangle(n).substring(maxWidth);
    }

    public String drawDiamondWithAName(int n, String name) {

        return triangle.drawIsoscelesTriangle(n - 1) +
                name + "\n" + triangle.drawUpsideDownIsoscelesTriangle(n - 1);
    }
}
