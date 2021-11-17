import java.util.ArrayList;
/**
 * Write a description of class team here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Team
{
    private ArrayList<Player> Players;
    int NumberofWins;
    String Coach;
    String Sport;
    public Team()
    {
        Players = new ArrayList<Player>();

    }

    public void NewTeam(int NumberofWins, String Coach, String Sport)
    {
        this.Coach = Coach;
        this.Sport = Sport;
        this.NumberofWins = NumberofWins;
    }

    public String Coach()
    {
        return Coach;
    }

    public String Sport()
    {
        return Sport;
    }

    public int NumberofWins()
    {
        return NumberofWins;
    }

    public String TeamInfo()
    {
        return "Coach: " + Coach + " Sport: " + Sport + " Number of Wins: " + NumberofWins;
    }

    public void SearchPlayers(String name)
    {
        for (Player player : Players)
        {
            if (player.Name().equals(name))
            {
                System.out.println(player.AllInfo());
            }
        }
    }

    public void AddPlayer(Player player)

    {
        Players.add(player);
    }
}

