public class Problem_14
{
    public static void main(String[] args)
    {
        long limit = Long.parseLong(args[0]);
        long max = 0;
        long num = 0;
        long[] chain = new long[2];

        for (long i = 2; i < limit; i++)
        {
            chain = collatz(i);
            if (chain[1] > max)
            {
                max = chain[1];
                num = chain[0];
                StdOut.println("Number " + num + " has chain size " + max);

            }
        }
    }

    public static long[] collatz(long n)
    {
        // return the length of the chain until n returns to 1.
        long[] chain = {0,0};
        long size = 1;
        long p = n;
        while (p != 1)
        {
            size += 1;
            if (p % 2 == 0)
                p = p / 2;
            else
                p = 3 * p + 1;
        }
        chain[0] = n;
        chain[1] = size;
        return chain;
    }
}
