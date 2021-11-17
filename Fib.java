
/**
 * Write a description of class fib here.
 * 
 * @author Peter Azmy
 * @version Oct 5 2015
 */
public class Fib
{
    public int Fib (int n)
    {
        if (n <= 1)
        {
            return n;
        }
        else
        {
            return Fib(n - 1) + Fib(n - 2);
        }
    }
    }