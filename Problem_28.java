public class Problem_28
{
    public static void main(String[] args)
    {
        int limit = Integer.parseInt(args[0]);

        StdOut.println("Spiral size = " + limit + " sum = " + diag_sum(limit));
    }

    public static long diag_sum(int n)
    {
        long sum = 0;
        long sum2 = 0;
        for (int i = 1; i <= n; i++)
        {
            sum2 += (i * (i - 1) + 1);
            if (i % 2 == 0)
                sum += Math.pow(i, 2) + 1;
            else
                sum += Math.pow(i, 2);
            StdOut.println("sum = " + sum + " sum2 = " + sum2);
        }
        return (sum+sum2-1);
    }
}
