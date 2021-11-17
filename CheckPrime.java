
/**
 * Checks to see if number is prime
 * 
 * @author Peter Azmy 
 * @version (a version number or a date)
 */
public class CheckPrime
{
    private int inputprime;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    public CheckPrime(int PrimeNumber)
    { inputprime = PrimeNumber;
        a = 2;
        b = 3;
        c = 5;
        d = 7;
        e = 11;
        f = 13;
        g = 17;
        h = 19;
        i = 23;
        j = 29;
        k = 31;
        h = 37;
        i = 41;
        j = 43;
        k = 47;

    }
    public void NewNumber(int newnumber)
    {
        inputprime = newnumber;
        inputprime = newnumber;
    }

        public void CheckifPrime ()
        {
            if(inputprime %  a != 0 && inputprime %  b != 0 && inputprime %  c != 0 && inputprime %  d != 0 && inputprime %  e != 0 && inputprime %  f != 0 && inputprime %  g != 0
            && inputprime %  h != 0 && inputprime %  i != 0 && inputprime %  j != 0 && inputprime %  k != 0)
                System.out.println(inputprime + " is a Prime number");
            else
                System.out.println(inputprime + " is not a Prime Number");
        }
    }

   
 
