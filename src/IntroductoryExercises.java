import java.util.ArrayList;
import java.util.Arrays;

public class IntroductoryExercises {

    public static void main(String[] args) {

        /*
        * Triangle Exercises
        * */
        System.out.println("Easiest exercise ever");
        System.out.print("*");
        System.out.println();

        System.out.println("Horizontal line");
        drawHorizontalLine(5);
        System.out.println();

        System.out.println("Vertical line");
        drawVerticalLine(5);

        System.out.println();
        System.out.println("Right triangle");
        drawRightTriangle(3);

        /*
         * Diamond Exercises
         * */
        System.out.println();
        System.out.println("Isosceles triangle");
        drawIsoscelesTriangle(3);

        System.out.println();
        System.out.println("Draw diamond");
        drawDiamond(2);

        System.out.println();
        System.out.println("Diamond with a name");
        drawDiamondWithAName(3);

        /*
         * FizzBuzz
         * */
        System.out.println();
        System.out.println("FizzBuzz");
        FizzBuzz();

        /*
         * Prime Factors Exercise
         * */
        System.out.println();
        System.out.println("Prime Factorisation");
        generate(30);

    }

    public static void drawHorizontalLine(int n) {
        for(int i = 0; i < n; i++)
            System.out.print("*");
    }

    public static void drawVerticalLine(int n) {
        for(int i = 0; i < n; i++)
            System.out.println("*");
    }

    public static void drawRightTriangle(int n) {
        StringBuilder output = new StringBuilder("*");
        for(int i = 0; i < n; i++) {
            System.out.println(output.toString());
            output.append("*");
        }
    }

    public static void drawIsoscelesTriangle(int n) {
        for(int i = 1; i < n + 1; i++) {
            for(int k = 0; k < n - i; k++)
                System.out.print(" ");

            for(int j = 0; j < (i * 2) - 1; j++)
                System.out.print("*");

            System.out.println();
        }
    }

    public static void drawDiamond(int n) {
        drawIsoscelesTriangle(n);
        drawUpsideDownIsoscelesTriangle(n - 1, 1);
    }

    public static void drawUpsideDownIsoscelesTriangle(int n, int loopLimit) {
        for(int i = n; i > 0; i--) {
            for(int k = 0; k < n - i + loopLimit; k++)
                System.out.print(" ");

            for(int j = 1; j <= (i * 2) - 1; j++)
                System.out.print("*");

            System.out.println();
        }
    }

    public static void drawDiamondWithAName(int n) {
        drawIsoscelesTriangle(n - 1);
        System.out.println("Ioanna");
        drawUpsideDownIsoscelesTriangle(n - 1, 0);
    }

    public static void FizzBuzz() {
        for(int i = 1; i <= 100; i++) {
            StringBuilder output = new StringBuilder("");
            if(i % 3 == 0)
                output.append("Fizz");
            if(i % 5 == 0)
                output.append("Buzz");

            if(output.toString().equals(""))
                System.out.println(i);
            else
                System.out.println(output.toString());
        }
    }


    public static void generate(int n) {
        ArrayList<Integer> listOfPrimeFactors = generatePrimeFactors(n);
        System.out.println(Arrays.toString(listOfPrimeFactors.toArray()));
    }


    public static ArrayList<Integer> generatePrimeFactors(int n) {
        ArrayList<Integer> listOfPrimeFactors = new ArrayList<>();

        for(int i = 2; i <= n; i++) {
            if(isPrime(i) && n % i == 0) {
                listOfPrimeFactors.add(i);
                n = n / i;
                i--;
            }
        }
        return listOfPrimeFactors;
    }

    public static boolean isPrime(int n) {
        if(n == 1)
            return false;

        for(int i = 2; i < n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
