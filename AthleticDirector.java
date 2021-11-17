import java.util.ArrayList;
/**
 * Write a description of class AthleticDirector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AthleticDirector
{
    public ArrayList<Team> team;
    public AthleticDirector()
    {
        team = new ArrayList<Team>();
    }

    public void SearchTeam(String name)
    {
        for (Team sport : team)
        {
            if (sport.Sport().equals(name))
            {
                System.out.println(sport.TeamInfo());
            }
        }
    }

    public void AddTeam(Team team)

    {
        this.team.add(team);
    }

    public void AddPlayer(Player player, String coach)
    {
        for(Team teams : team)
        {
            if(teams.Coach().equals(coach))
            {
                teams.AddPlayer(player);

            }

        }
    }

    public void SearchPlayer(String Name, String Sport)
    {
        for(Team teams : team)
        {
            if(teams.Sport().equals(Sport))
            {
                teams.SearchPlayers(Name);
            }
        }
    }
}

