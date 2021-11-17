
/**
 * Averages two population for two different years if a state
 * enjoy
 * 
 * @author Peter Azmy 
 * @version 09/25/2015
 */
public class Population
{
    private double avg;
    private int PopulationX;
    private int PopulationY;
    private String Statename;
    public void Population (int populationx, int populationy, String State)
    {
        PopulationX = populationx;
        PopulationY = populationy;
        Statename = State;
    }

    public double PrintAverage ()
    {
        double z = (PopulationX - PopulationY);
        avg = (z / 15.000);
        System.out.println("Population for " + Statename + " in 2000 was " + PopulationY);
        System.out.println("Population for " + Statename + " in 2015 is " + PopulationX); 
        System.out.println("Average for " + Statename + " is " + avg);
        return avg;
        // inouts two numbers and states and averages them out
    }
   }