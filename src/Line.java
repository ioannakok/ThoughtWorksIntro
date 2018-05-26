public class Line {

    public String drawDot() {
        return "*";
    }

    public String drawHorizontalLine(int n) {
        StringBuilder line = new StringBuilder();
        for(int i = 0; i < n; i++)
            line.append("*");

        return line.toString();
    }

    public String drawVerticalLine(int n) {
        StringBuilder line = new StringBuilder();
        for(int i = 0; i < n; i++) {
            line.append((i == n - 1) ? "*" : "*\n");
        }

        return line.toString();
    }
}
