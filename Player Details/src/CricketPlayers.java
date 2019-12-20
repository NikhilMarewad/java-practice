public class CricketPlayers extends Players implements IPlayerStatistic
{
	private int totalRunsScored;
	private int noOfWicketsTaken;

public CricketPlayers(String name, String teamName, int noOfMatches, int totalRunsScored, int noOfWicketsTaken) {
	super(name, teamName, noOfMatches);
	this.totalRunsScored = totalRunsScored;
	this.noOfWicketsTaken = noOfWicketsTaken;
}

@Override
public void displayPlayerStatistics() {
	System.out.println("Cricket Player: ");
System.out.println("Player Name "+name);
System.out.println("Team Name"+teamName);
System.out.println("No of matches"+noOfMatches);
System.out.println("Total Runs Scored "+totalRunsScored);
System.out.println(" No of wickets taken"+noOfWicketsTaken);
	
}




	
}
