
/**
 * Write a description of class penis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewsCaster
{ 

    private int x;
    private DestroythePlanet y;
    public NewsCaster()
    {
       y= new DestroythePlanet();
    }

    public void WatchNews()

    { x = (int) (Math.random()*5);

        if (x == 0)
        { CNN();
        }
        else if (x == 1)
        {
            Fox();
        }
        else if (x == 2)
        {
            KTLA();
        }
        else if (x == 3)
        {
            ABC();
        }
        else if (x == 4)
        {
            BBC();
        }
    }

    private void CNN()
    {
        System.out.println("This is CNN News and now we return to Bob on set- ");
        System.out.println(); 
        System.out.println();
        System.out.println("Bob: FUCK HER RIGHT IN THE PUSSY");
        System.out.println();
    }

    private void Fox()
    {
        System.out.println("This is Fox News and now we return to Bob on set- ");
        System.out.println();
        System.out.println();
        System.out.println("Bob: BUSH DID 9/11");
        System.out.println();
    }

    private void KTLA()
    {
        System.out.println("This is KTLA News and now we return to Bob on set- ");
        System.out.println();
        System.out.println();
        System.out.println("Bob: OBAMA IS CAUSING TERRORISM");
        System.out.println();
    }

    private void ABC()
    {
        System.out.println("This is ABC News and now we return to Bob on set- ");
        System.out.println();
        System.out.println();
        System.out.println("Bob: SOMEBODY PLEASE WATCH US");
        System.out.println();
    }

    private void BBC()
    {
        System.out.println("This is BBC News and now we return to Bob on set- ");
        System.out.println();
        System.out.println();
        System.out.println("Bob: WHY THE FUCK IS THE TARDIS HERE");
        System.out.println();
    }
    public void DisneyChannel()
    {
        System.out.println(y.DestroyHumanity());

    }
}
