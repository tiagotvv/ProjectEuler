public class Problem_6
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);

        int sum = 0;
        int sum_of_sq = 0;
        int diff = 0;

        for (int i = 1; i <= N; i++)
        {
            sum_of_sq += i*i;
            sum += i;
        }
        diff = sum*sum - sum_of_sq;

        StdOut.println("diff = " + diff);
    }
}