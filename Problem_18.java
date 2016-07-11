public class Problem_18
{

    public static void main(String[] args)
    {

        int N = StdIn.readInt(); // will read from a triangle file.
        StdOut.println(N);

        int[] a = new int[N];
        int[] b = new int[N];
        int[] c = new int[N];
        int i = 1;

        while(i < N)
        {
            if (i == 1)
            {
                a[0] = StdIn.readInt();
                b[0] = StdIn.readInt();
                b[1] = StdIn.readInt();
                c = combine(a,b);
                i++;
            }
            else
            {
                for (int j = 0; j <= i; j++)
                {
                    a[j] = c[j];
                    b[j] = StdIn.readInt();
                }
                c = combine(a,b);
                i++;
            }
        }
        StdOut.println("Max = " + max(c));
    }

    public static int[] combine(int[] a, int[] b)
    {
        int size_b = b.length;
        int[] c = new int[size_b];

        for(int i = 0; i < size_b; i++)
        {
            if(i == 0)
                c[i] = a[i] + b[i];
            else if(i == size_b-1)
                c[i] = a[i-1] + b[i];
            else
                c[i] = max(a[i] + b[i],a[i-1] + b[i]);
        }
        return c;
    }

    public static int max(int a, int b)
    {
        if (a <= b)
            return b;
        else
            return a;
    }

    public static int max(int[] a)
    {
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < a.length; j++)
        {
            if (a[j] > max)
                max = a[j];

        }
        return max;
    }
}
