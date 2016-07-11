public class Problem_7
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int num = 2;    
        int count = 1;

        while (count <= N)
        {
            for (int i = 2; i <= num; i++)
            {
                if (num % i == 0)
                {
                    if (num == i)
                        count = count + 1;
                break;
                }
            }
            num = num + 1;
        }
        StdOut.println((count-1) + "-th prime = " + (num-1));
    }
}
