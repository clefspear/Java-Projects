import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class RandomTest here.
 * 
 * @Peter Azmy 
 * @version (a version number or a date)
 */
public class RandomTest
{
    private Random x;
    private ArrayList<Integer> list;
    public RandomTest()
    {
        x = new Random();
        list = new ArrayList<Integer>();
    }

    public int giveRandomValue(int randomMax)
    {
        return x.nextInt (randomMax + 1);
    }

    public void addRandomToList(int amountOfRandomsToAdd)
    {
        int y = 0;
        while(y <  amountOfRandomsToAdd)
        {
            list.add(x.nextInt(101));
            y++;
        }
    }
    public void printList()
    {
        int y= 0;
        while(y < list.size())
        {
            System.out.println(y + 1 + ": " + list.get(y));
            System.out.println();
            y++;
        }
    }
    public void giveEven()
    {
        int y = 0;
        while(y < list.size())
        {
            if(list.get(y) % 2 == 0)
            {
                System.out.println(y + 1 + ": " + list.get(y));
                System.out.println();
            }
            else
            {
                System.out.println("Nah,Son. Try Again");
                System.out.println();
            }
            
            y++;
            
        }
    }
    public void giveOdd()
    {
        int y = 0;
        while(y < list.size())
        {
            if(list.get(y) % 2 != 0)
            {
                System.out.println(y + 1 + ": " + list.get(y));
                System.out.println();
            }
            else
            {
                System.out.println("Nah,Son. Try Again");
                System.out.println();
            }
            y++;
        }
    }
}
