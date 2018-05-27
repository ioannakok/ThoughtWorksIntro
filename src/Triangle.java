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

        return drawTriangle(height, false);
    }

    public String drawUpsideDownIsoscelesTriangle(int height) {

        return drawTriangle(height, true);
    }

    private String drawTriangle(int height, boolean isUpsideDown) {
        StringBuilder triangle = new StringBuilder();
        int maxSpaces = height - 1;
        int maxWidth = (height * 2) - 1;

        for(int row = 0; row < height; row++) {

            int spaceEndPoint = (isUpsideDown) ? row + 1 : maxSpaces - row;
            int spaceStartPoint = (isUpsideDown) ? 1 : 0;
            int asteriskStartPoint = (isUpsideDown) ? row : height - row;
            int asteriskEndPoint = (isUpsideDown) ? maxWidth - row - 1 : height + row;

            for(int j = 0; j <= maxWidth; j++) {

                if(j >= spaceStartPoint && j < spaceEndPoint)
                    triangle.append(" ");

                if(j >= asteriskStartPoint && j <= asteriskEndPoint)
                    triangle.append("*");
            }

            if(row != maxSpaces)
                triangle.append("\n");
        }

        return triangle.toString();
    }
}
