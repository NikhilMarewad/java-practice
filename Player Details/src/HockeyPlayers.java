public class HockeyPlayers extends Players implements IPlayerStatistic {
	private String position;
	private int noOfGoals;

	public HockeyPlayers(String name, String teamName, int noOfMatches, String position, int noOfGoals) {
		super(name, teamName, noOfMatches);
		this.position = position;
		this.noOfGoals = noOfGoals;
	}

	@Override
	public void displayPlayerStatistics() {
		System.out.println("Hockey Player:");
		System.out.println("Player Name "+name);
		System.out.println("Team Name"+teamName);
		System.out.println("No of matches"+noOfMatches);
		System.out.println("Position "+position);
		System.out.println(" No of goals taken "+noOfGoals);

	}
}
