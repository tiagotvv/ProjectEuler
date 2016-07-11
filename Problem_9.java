public class Problem_9
{
    public static void main(String[] args)
    {
        int k, p, q, r;
        for (int i = 1; i <= 998; i++)
        {
            for (int j = 1; j <= 998; j++)
            {
                k = 1000 - i - j;
                p = i*i;
                q = j*j;
                r = k*k;
                if (p == r + q)
                {
                    StdOut.println("i = " + i + " j = " + j + " k = " + k + " prod = " + i*j*k);
                    break;
                }
            }
        }
    }
}
