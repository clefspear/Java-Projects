/**
   * This class switches the variables "X" and "Y"
 * Input a set number for "x" and "y" and then they switch spots
 * 
 * This example was made for an A in Armstrong and hope you enjoy
 * 
 * @author Peter Azmy
 * @version 2015.09.17
 */
public class Opposite
{
    public int x;
    public int y;
    public int startx;
    /**
     * Constructor for x and y variables
     */
    public Opposite(int Xvalue, int Yvalue)
    {
        x = Xvalue;
        y = Yvalue;
       
        // this assigns where the variables are equivalent to each other
      
    }
   public void Opposite()
  {
    startx = x;
    x = y;
    y = startx; 
    
    //this switches the variables for "x" and "y"
}
public void Printinfo()
{
    System.out.println("x = " + x);
    System.out.println("y = " + y); 
    // prints out the value 
}
}




