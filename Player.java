
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    String Name;
    int YearsonTeam;
    int JerseyNumber;
    public Player(String Name, int YearsonTeam, int JerseyNumber)
    {
        this.Name = Name;
        this.YearsonTeam = YearsonTeam;
        this.JerseyNumber = JerseyNumber;
    }

    public String Name()
    {
        return Name;
    }

    public int YearsonTeam()
    {
        return YearsonTeam;
    }   

    public int JerseyNumber()
    {
        return JerseyNumber;
    }
    public String AllInfo()
    {
        return "Player: " + Name + " "  + " (Has Played for " + YearsonTeam + " years) Has Jersey Number " + JerseyNumber;
    }
}

