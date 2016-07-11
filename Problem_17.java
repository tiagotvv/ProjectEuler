
public class Problem_17
{

    public static void main(String[] args) 
    {
        int limit = 1000; 
        String number;
       // StdOut.println("number = " +  limit + " " + number);

        int length = 11;

        for (int i = 1; i < limit; i++)
        {
            number = decompose(i);
            length += number.length();
        }
        
        StdOut.println("length = " +  length);
     
    }

    public static String decompose(int n)
    {
        String number = "";
        int cr = n % 100;
        int c = n / 100;
        int d = cr / 10;
        int dr =  cr % 10;


        if (c == 0)
        {
            if (d == 0)
                number = converter(dr);
            else if(d == 1)
                number = converter(cr);
            else
                number = converter(d*10)+converter(dr);
        }

        else
        {
            if (d == 0)
            {
                if (dr == 0)
                    number = converter(c) + converter(100);
                else
                    number = converter(c) + converter(100) + "and" + converter(dr);
            }
            else if(d == 1)
                number = converter(c) + converter(100) + "and" + converter(cr);
            else
                number = converter(c) + converter(100) + "and" + converter(d*10)+converter(dr);
        }


        return(number);
    }    

    public static String converter(int n)
    {
        String number = "";
        switch (n) 
        {
            case 0:  number = "";
                     break;
            case 1:  number = "one";
                     break;
            case 2:  number = "two";
                     break;
            case 3:  number = "three";
                     break;
            case 4:  number = "four";
                     break;
            case 5:  number = "five";
                     break;
            case 6:  number = "six";
                     break;
            case 7:  number = "seven";
                     break;
            case 8:  number = "eight";
                     break;
            case 9:  number = "nine";
                     break;
            case 10: number = "ten";
                     break;
            case 11: number = "eleven";
                     break;
            case 12: number = "twelve";
                     break;
            case 13: number = "thirteen";
                     break;
            case 14: number = "fourteen";
                     break;
            case 15: number = "fifteen";
                     break;
            case 16: number = "sixteen";
                     break;
            case 17: number = "seventeen";
                     break;
            case 18: number = "eighteen";
                     break;
            case 19: number = "nineteen";
                     break;
            case 20: number = "twenty";
                     break;
            case 30: number = "thirty";
                     break;
            case 40: number = "forty";
                     break;
            case 50: number = "fifty";
                     break;
            case 60: number = "sixty";
                     break;
            case 70: number = "seventy";
                     break;
            case 80: number = "eighty";
                     break;
            case 90: number = "ninety";
                     break;
            case 100: number = "hundred";
                     break;
        }
        return number;
    }
}
