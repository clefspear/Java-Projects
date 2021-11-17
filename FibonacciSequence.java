
/**
 * Write a description of class FibonacciSequence here.
 * 
 * @author Peter Azmy 
 * @version (a version number or a date)
 */
public class FibonacciSequence
{

public void SequenceLoop(int n)
{
    int a = 0;
    int oldX = 1;
    int x = 1;
    System.out.println(1);
    System.out.println(1);
    while(a< n-2)
    {
        int newX = x + oldX;
        System.out.println(newX);
        oldX = x;
        x = newX;
        a ++;
    }
}
}
    
    