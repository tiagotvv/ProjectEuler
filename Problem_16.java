import java.math.BigInteger;

public class Problem_16
{
    public static void main(String[] args) {

        BigInteger b1 = new BigInteger("2");
        BigInteger power = b1.pow(1000);
        String b2 = power.toString();

        int sum = 0;

        for (int j = 0; j < b2.length(); j++)
        {
            sum += (b2.charAt(j) - '0');
        }

        StdOut.println("2 ^ 1000 = " + power);
        StdOut.println("sum of digits = " + sum);
    }
}
