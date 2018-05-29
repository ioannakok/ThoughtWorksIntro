import java.util.ArrayList;
import java.util.List;

public class Primes {

    public List<Integer> generate(int n) {
        List<Integer> primes = new ArrayList<>();
        for(int i = 1; i <= n; i++)
            if(isPrime(i))
                primes.add(i);

        return primes;
    }

    public boolean isPrime(int n) {
        if(n == 1)
            return false;

        for(int i = 2; i < n; i++)
            if(n % i == 0 && n != 2)
                return false;

        return true;
    }
}
