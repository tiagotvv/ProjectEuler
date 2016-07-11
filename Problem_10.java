public class Problem_10
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        long num = 3;

        long sum = 2;
        int count = 1;

        while (num <= N)
        {
            for (long i = 2; i <= (num-1); i++)
            {
                if (num % i != 0)
                {
                    if (i == (num-1))
                    {
                        sum = sum + num;
                        count = count + 1;
                        StdOut.println((count) + "-th prime = " + (num) + " sum = " + sum);
                    }
                }
                else break;
            }
            num = num + 1;
        }
        //StdOut.println((count-1) + "-th prime = " + (num-1) + " sum = " + sum);
    }
}
