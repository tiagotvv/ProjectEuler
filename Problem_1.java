public class Problem_1
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
      
        int sum = 0;
        for (int i = 1; i < N; i++)
        {
            
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;

        }
        StdOut.println("Sum = " + sum);
    }
}