public class Problem_4
{
    public static void main(String[] args)
    {
        int max = 1;
        for (int i = 999; i > 99  ; i--)
        {
            for (int j = i; j > 99; j--)
            {
                int prod = i * j;
                String prod1 = Integer.toString(prod);
                String prod1_rev = "";
                int k = prod1.length();
                for (int m = 0; m < k; m++)
                {
                    prod1_rev = prod1_rev + prod1.charAt(k - 1 - m);
                }
                if (prod1.equals(prod1_rev))
                {
                    if (prod > max)
                        {
                            max = prod;
                            StdOut.println("i = " + i + " j = " + j + " prod = " + prod);
                        }
                    break;
                }
            }
        }
    }
}
