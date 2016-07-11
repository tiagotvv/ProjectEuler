public class StdStats
{
    public static double mean(double[] a) 
    {   
        double sum = 0.0;
        for (int i = 0; i < a.length; i++)
        {
            sum = sum + a[i];
        }
        return sum / a.length;
    }

    public static double mean(int[] a) 
    {   
        double sum = 0.0;
        for (int i = 0; i < a.length; i++)
        {
            sum = sum + a[i];
        }
        return sum / a.length;
    }

    public static double sum(double[] a) 
    {   
        double sum = 0.0;
        for (int i = 0; i < a.length; i++)
        {
            sum = sum + a[i];
        }
        return sum;
    }

    public static int sum(int[] a) 
    {   
        int sum = 0;
        for (int i = 0; i < a.length; i++)
        {
            sum = sum + a[i];
        }
        return sum;
    }


    public static double max(double[] a)
    {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    public static int max(int[] a)
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    public static double min(double[] a)
    {
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < min) min = a[i];
        }
        return min;
    }

    public static int min(int[] a)
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < min) min = a[i];
        }
        return min;
    }

    public static double var(double[] a)
    {
        double avg = mean(a);
        double sum = 0.0;
        for (int i = 0; i < a.length; i++)
        {
            sum += ((a[i] - avg) * (a[i] - avg));
        }
        return sum / (a.length - 1);
    }

    public static double var(int[] a)
    {
        double avg = mean(a);
        double sum = 0.0;
        for (int i = 0; i < a.length; i++)
        {
            sum += ((a[i] - avg) * (a[i] - avg));
        }
        return sum / (a.length - 1);
    }

    public static double stddev(double[] a)
    {
        return Math.sqrt(var(a));
    }

    public static double stddev(int[] a)
    {
        return Math.sqrt(var(a));
    }

       /**
     * Plots the points (i, a[i]) to standard draw.
     *
     * @param a the array of values
     */
    public static void plotPoints(double[] a) {
        int N = a.length;
        StdDraw.setXscale(-1, N);
        StdDraw.setPenRadius(1.0 / (3.0 * N));
        for (int i = 0; i < N; i++) {
            StdDraw.point(i, a[i]);
        }
    }


    public static void plotLines(double[] a) 
    {
        int N = a.length;
        StdDraw.setXscale(-1, N);
        StdDraw.setPenRadius();
        for (int i = 1; i < N; i++) 
        {
            StdDraw.line(i-1, a[i-1], i, a[i]);
        }
    }

    public static void plotBars(double[] a) 
    {
        int N = a.length;
        StdDraw.setXscale(-1, N);
        for (int i = 0; i < N; i++) 
        {
            StdDraw.filledRectangle(i, a[i]/2, .25, a[i]/2);
        }
    }


    public static void main(String[] args)
     {
        double[] a = StdArrayIO.readDouble1D();
        StdOut.printf("       min %10.3f\n", min(a));
        StdOut.printf("      mean %10.3f\n", mean(a));
        StdOut.printf("       max %10.3f\n", max(a));
        StdOut.printf("       sum %10.3f\n", sum(a));
        StdOut.printf("    stddev %10.3f\n", stddev(a));
        StdOut.printf("       var %10.3f\n", var(a));
    }
}




