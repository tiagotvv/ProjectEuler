public class StdArrayIO
{

    public static void print(double[] a)
    {
        StdOut.println(a.length);
        for (int i = 0; i < a.length; i++)
        {
            StdOut.println(a[i]);
        }
    }

    public static void print(double[][] a)
    {
        StdOut.println(a.length + " " + a[0].length);
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                StdOut.print(a[i][j] + " ");
            }
            StdOut.println();
        }
    }
    public static void print(int[] a)
    {
        StdOut.println(a.length);
        for (int i = 0; i < a.length; i++)
        {
            StdOut.println(a[i]);
        }
    }

    public static void print(int[][] a)
    {
        StdOut.println(a.length + " " + a[0].length);
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                StdOut.print(a[i][j] + " ");
            }
            StdOut.println();
        }
    }

    public static void print(boolean[] a)
    {
        StdOut.println(a.length);
        for (int i = 0; i < a.length; i++)
        {
            StdOut.println(a[i]);
        }
    }

    public static void print(boolean[][] a)
    {
        StdOut.println(a.length + " " + a[0].length);
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                StdOut.print(a[i][j] + " ");
            }
            StdOut.println();
        }
    }

    public static double[][] readDouble2D()
    { // Reasd 2D array of double values with dimensions in row major order
        int M = StdIn.readInt();
        int N = StdIn.readInt();
        double[][] a = new double[M][N];
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                a[i][j] = StdIn.readDouble();

        return a;

    }

    public static double[] readDouble1D()
    { // Reasd 1D array of double values. Integer N followed by N values
        int N = StdIn.readInt();
        double[] a = new double[N];
        for (int i = 0; i < N; i++)
                a[i] = StdIn.readDouble();
        return a;

    }

    public static int[][] readInt2D()
    { // Reasd 2D array of double values with dimensions in row major order
        int M = StdIn.readInt();
        int N = StdIn.readInt();
        int[][] a = new int[M][N];
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                a[i][j] = StdIn.readInt();

        return a;

    }

    public static int[] readInt1D()
    { // Reasd 1D array of double values. Integer N followed by N values
        int N = StdIn.readInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++)
                a[i] = StdIn.readInt();
        return a;

    }

    public static boolean[][] readBoolean2D()
    { // Reasd 2D array of double values with dimensions in row major order
        int M = StdIn.readInt();
        int N = StdIn.readInt();
        boolean[][] a = new boolean[M][N];
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                a[i][j] = StdIn.readBoolean();

        return a;

    }

    public static boolean[] readBoolean1D()
    { // Reasd 1D array of double values. Integer N followed by N values
        int N = StdIn.readInt();
        boolean[] a = new boolean[N];
        for (int i = 0; i < N; i++)
                a[i] = StdIn.readBoolean();
        return a;

    }

    public static void main(String[] args)
    { 
        double[] a = {6.5, 6, 8, -11, 6.5};
        double[][] c = {{1, -2}, {2, -1}};
        print(a);
        print(c);
    }


}