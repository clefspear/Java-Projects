
/**
 * Write a description of class numberscramble here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberScrambler
{
    private int x;
    private int y;
    private int z;
    private int a;
    private int b;
    private int c;
    public NumberScrambler( int myX, int myY, int myZ)
    {
        x = myX;
        a = myX;
        y = myY;
        b = myY;
        z = myZ;
        c = myZ;
    }
    public void Switch()
    {
        b = x;
        x = c;
        c = y;
        y = a;
        a = z;
        z = c;
        System.out.println(x + "," + y + "," + z);
    }
    public void ChangeNumbers()
    {
        x = c;
        c = a;
        a = z;
        z = c;
    }
}
        
