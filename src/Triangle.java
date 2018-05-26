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
}
