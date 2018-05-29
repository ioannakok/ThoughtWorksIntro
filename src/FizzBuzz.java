public class FizzBuzz {

    public String fizzBuzz() {

        StringBuilder output = new StringBuilder();

        for(int i = 0; i <= 100; i++)
            output.append(convertToFizzBuzz(i));

        return output.toString();
    }

    public String convertToFizzBuzz(int number) {

        if(number % 15 == 0)
            return "FizzBuzz";

        if(number % 3 == 0)
            return "Fizz";

        if(number % 5 == 0)
            return "Buzz";

        return Integer.toString(number);
    }
}
