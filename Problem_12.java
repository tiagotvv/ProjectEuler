public class Problem_12
{
    public static void main(String[] args)
    {
        int limit = Integer.parseInt(args[0]);
        int divisors = 1;
        long i = 0;
        long N = 0;
        while(divisors <= limit)
        {
            i += 1;
            N += i;
            divisors = num_div(N);
            StdOut.println(N + " has " + divisors + " divisors.");
        }
    }

    public static int num_div(long N)
    {
        // return number of divisors of number N
        int num = 1;
        for (long i = 2; i <= N  ; i++)
        {
            int exp = 0;
            while (N % i == 0)
            {
                N = N / i;
                exp = exp + 1;

            }
            if (exp != 0)
            {
                num *= (exp+1);
            }
        }
    return num;
    }
}
