public class Problem_2
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
      
        int sum = 0;
        int i = 1;
        int j = 1;
        int prev_i;
        while (i < N)
        {
            StdOut.println("i = " + i);
            if (i % 2 == 0)
                sum += i;
            prev_i = j;
            j = i;
            i = i + prev_i;

        }
        StdOut.println("Sum = " + sum);
    }
}