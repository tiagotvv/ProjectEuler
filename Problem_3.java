public class Problem_3
{
    public static void main(String[] args)
    {
        long N = Long.parseLong(args[0]);

        for (long i = 2; i <= N  ; i++)
        {
            while (N % i == 0)
            {
                N = N / i;
                StdOut.println("factor = " + i + " Nres = " + N);
            }
        }
    }
}
