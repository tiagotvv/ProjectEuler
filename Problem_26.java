public class Problem_26
{
    public static void main(String[] args)
    {
         int limit = Integer.parseInt(args[0]);
         int max = 0;
         int size = 0;


        for (int i = 1; i <= limit; i++)
        {
            size = period(i);

            if (size > max)
            {
                max = size;
                StdOut.println("d = " + i + " period = " + period(i));
            }
        }
    }

    public static int period(int n)
    {
        // compute the period of a recurring cycle in the fraction 1/n
        int size = 0;
        int[] digits = new int[n];
        int j = 1;
        int tmp;
        int rem = 10 % n;
        while(rem != 0)
        {
            if (digits[rem] == 0)
            {
                digits[rem] = j;
                j++;
            }
            else
            {
                size = j - digits[rem];
                break;
            }
            rem = (10*rem % n);
        }
        return size;
    }
}
