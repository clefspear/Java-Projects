
/**
 * Write a description of class Salami here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Salami
{
    private String food1;
    private String food2;
    public Salami(String food1, String food2)
    {
        this.food1 = food1;
        this.food2 = food2;
    }
    public void PrintFood()
    {
        System.out.println( "Bacon is now " + food1);
        System.out.println( "Orange is now " + food2);
        System.out.println();
    }
}
