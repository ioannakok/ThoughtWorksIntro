public class Diamond {

    Triangle triangle = new Triangle();

    public String drawDiamond(int n) {
        int maxWidth = (n * 2) - 1;

        return triangle.drawIsoscelesTriangle(n) +
                triangle.drawUpsideDownIsoscelesTriangle(n).substring(maxWidth);
    }

}
