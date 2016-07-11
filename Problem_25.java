import java.math.BigInteger;

public class Problem_25
{
    public static void main(String[] args)
    {
        BigInteger z = BigInteger.ONE;
        int i = 2;
        String p = z.toString();
        while(p.length() < 1000)
        {
            z = fibonacci(i);
            p = z.toString();
            i++;
        }
        StdOut.println("index = " + (i-1) + " number = " + z);
    }

    public static BigInteger fibonacci(int n)
    {
        BigInteger[] fib = new BigInteger[3]; // fibonacci using memoization
        fib[0] = BigInteger.ZERO;
        fib[1] = BigInteger.ONE;
        int i = 2;
        while(i <= n)
        {
            fib[2] = fib[1].add(fib[0]);
            fib[0] = fib[1];
            fib[1] = fib[2];
            i++;
        }
        return fib[2];
    }
}
