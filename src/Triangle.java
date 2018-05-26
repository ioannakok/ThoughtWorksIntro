public class Triangle {

    public String drawRightTriangle(int n) {
        StringBuilder triangle = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++)
                triangle.append("*");

            if(i != n - 1)
                triangle.append("\n");
        }
        return triangle.toString();
    }

    public String drawIsoscelesTriangle(int height) {
        StringBuilder triangle = new StringBuilder();

        for(int row = 1; row < height + 1; row++) {

            for(int space = 0; space < height - row; space++)
                    triangle.append(" ");

            for(int width = 0; width < (row * 2) - 1; width++)
                triangle.append("*");

            if(row != height)
                triangle.append("\n");
        }
        return triangle.toString();
    }

    public String drawUpsideDownIsoscelesTriangle(int height) {
        StringBuilder triangle = new StringBuilder();

        for(int row = height; row > 0; row--) {
            for(int space = 0; space < height - row; space++)
                triangle.append(" ");

            for(int width = 1; width <= (row * 2) - 1; width++)
                triangle.append("*");

            if(row != 1)
                triangle.append("\n");
        }

        return triangle.toString();
    }
}
