import java.util.ArrayList;
/**
 * Program ArrayList 
 * Use ArrayList
 * Have a method to cude first 5 numbers
 * How to remove item from a list
 * How to add item from a list
 * Prints single statement
 * Prints all statements
 * Receive Item Size
 * 
 * @author Peter Azmy 
 * @version 10/13/15
 */
public class ArrayTest
{
    /**
     * Field Variables
     */
    private int x; 
    private ArrayList<String> items;
    public ArrayTest()
    {
        items = new ArrayList<String>();
        // adds arraylist
    }

    public void AddItems(String item)
    {
        items.add(item);
        // add items to list
    }

    public void PrintSingleItem(int ItemNumber)
    {
        /**
         * Prints single item from array list made from different constructor
         */
        if (ItemNumber < 1)
        {
            System.out.println(ItemNumber + " is not valid number");
        }
        else if (ItemNumber <= items.size())
        {
            System.out.println(items.get(ItemNumber - 1));
        }
        else
        {
            System.out.println(ItemNumber + " is not valid number");
        }
    }
    public void RemoveAll(int ItemNumber)
    {
        items.clear();
    }

    public void RemoveItem(int ItemNumber)
    {
        /**
         * Removes Single item from array list made from a different constructor
         */
        if (ItemNumber < 1)
        {
            System.out.println(ItemNumber + " is not valid number");
        }
        else if (ItemNumber  <= items.size())
        {
            items.remove(ItemNumber - 1);
        }
        else
        {
            System.out.println(ItemNumber + " is not valid number");
        }

    }

    public void SearchTerm(String Search)
    {
        int index = 0;
        boolean found = false;
        while(index < items.size() && !found)
        {
            String item = items.get(index);
            if(item.contains(Search))
            {
                found = true;
                System.out.println(index + 1 + ": " + items.get(index));
            }
            else
            {
                index++;
            }
        }
    }

    public void Print()
    {
        int itemNumber = 1;
        for(String item : items )
        {
            System.out.println(itemNumber + " : " + item);
            itemNumber++;
        }
        // Prints all items made in the list
    }

    public int GetItemSize()
    {
        return items.size();
        //determines number of items listed in the array
    }

    public void CubeNumbers()
    {
        int x = 0;
        while(x < 5)
        {
            items.add((x * x * x + ""));
            x++;
        }
        // cubes the first 5 numbers in the sequence starting from 0
    }

}