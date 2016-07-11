public class StdRandom
{
    public static int uniform(int N) 
    {   // Return a uniform integer between 0 and N-1
        return (int) (Math.random() * N);
    }

    public static double uniform(double lo, double hi)
    {   // Return a real number uniformly distributed between lo and hi

        return (hi - lo) * Math.random() + lo;
    }

    public static boolean bernoulli(double p)
    {   // Return true with probability p, and false with probability (1-p)
        return Math.random() < p;
    }

    public static double exponential(double lambda)
    {   // Return an exponential random variable with parameter lambda
        double x = uniform(0.0,1.0);
        return (- Math.log(x) / lambda);
    }

    public static double gaussian()
    { // return a gaussian rv with mean 0 and std dev 1 using Box-Muller formula
        double x, y;
        x = uniform(0.0,1.0);
        y = uniform(0.0,1.0);
        return Math.cos(2 * Math.PI * x) * Math.sqrt(-2 * Math.log(y));
    }

        public static double gaussian(double mu, double sigma)
    { // return a gaussian rv with mean mu and std dev sigma
        return mu + sigma * gaussian();
    }



    public static int discrete(double[] a)
    {   // discrete distribution with probabilities of each outcome in array a
        double r = uniform(0.0, 1.0);
        double sum = 0.0;
        for (int i = 0; i < a.length; i++)
        {
            sum = sum + a[i];
            if (sum > r) return i;
        }
        return a.length - 1;
    }

    public static void shuffle(double[] a)
    {   
        int N = a.length;
        for (int i = 0; i < N; i++)
        {
            int r = i + (int)(Math.random()*(N - i));
            double t = a[i];
            a[i] = a[r];
            a[r] = t;
        }
    }

    public static double maxwellBoltzmann(double sigma)
    {   
        double g1 = gaussian(0, sigma);
        double g2 = gaussian(0, sigma);
        double g3 = gaussian(0, sigma);
        return Math.sqrt(g1*g1 + g2*g2 + g3*g3);
    }

    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]); 
        double[] t = { .5, .3, .1, .1};
        double[] a = { 1, 2, 3, 4 };
        for (int i = 0; i < N; i++)
        {
            StdOut.printf("%2d ", uniform(100));
            StdOut.printf("%8.5f ", uniform(10.0,99.0));
            StdOut.printf("%5b ", bernoulli(.5));
            StdOut.printf("%7.5f ", gaussian(9.0, 0.2));
            StdOut.printf("%2d ", discrete(t));
            
            shuffle(a);
            for (int j = 0; j < a.length; j++)
                StdOut.printf("%.0f ",a[j]);
            
            StdOut.println();
        }



    }


}
