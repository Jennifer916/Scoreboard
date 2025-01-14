public class Scoreboard
{
    private String teamOne;
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private String activeTeam;
    public String getScore()
    {
        return teamOneScore + "-" + teamTwoScore + "-" + activeTeam;
    }
    public Scoreboard(String one, String two)
    {
        teamOne = one;
        teamTwo = two;
        activeTeam = teamOne;

    }
    public void recordPlay(int score)
    { if(score == 0)
        {
            if(activeTeam.equals(teamOne)) activeTeam = teamTwo;
            else if (activeTeam.equals(teamTwo)) activeTeam = teamOne;
        }

        if(teamOne.equals(activeTeam)){
            teamOneScore += score;
        }
        if(teamTwo.equals(activeTeam)){
            teamTwoScore += score;
        }

    }

}
