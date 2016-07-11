import java.math.BigInteger;

public class Problem_20
{

    public static void main(String[] args)
    {    
        int x = 100;
        BigInteger b1 = factorial(x);
        String b2 = b1.toString();
        StdOut.println("factorial of " + x + " is " + b1);

        int sum = 0;

        for (int j = 0; j < b2.length(); j++)
        {
            sum += (b2.charAt(j) - '0');
        }

        StdOut.println("sum of digits of is " + sum);
    }

    public static BigInteger factorial(int n)
    {
        String x = Integer.toString(n);
        BigInteger fat = new BigInteger(x);
        if (n == 1)
            return fat;
        else
            return fat.multiply(factorial(n-1));
    }
}
