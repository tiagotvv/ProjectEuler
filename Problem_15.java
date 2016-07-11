public class Problem_15
{
    public static void main(String[] args)
    {
        int limit = Integer.parseInt(args[0]);

        StdOut.println("N = " + limit + " paths = " + lattice(limit, limit));
    }

    public static long lattice(int n, int m)
    {
        // compute recursively number of paths in the lattice of size n x m
        long paths = 0;
        if (n == 1 && m == 1)
            paths = 2;
        else if(n == 1)
            paths = 1 + lattice(1, m - 1);
        else if (m == 1)
            paths = 1 + lattice(n - 1, 1);
        else
            paths = lattice((n - 1),m) + lattice(n, m - 1);
        return paths;
    }
}
