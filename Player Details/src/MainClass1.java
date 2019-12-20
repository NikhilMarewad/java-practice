import java.util.Scanner;

public class MainClass1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Players pr1;
		Players pr2;
		// CricketPlayers pr1 = new CricketPlayers("M S Dhoni","CSK", 300, 10000, 0);
		// HockeyPlayers pr2 = new HockeyPlayers("Yuvraj Walmiki ","Delhi WaveRiders ",
		// 34, "Forward  ", 9);

		System.out.println("1.Cricket Player Details  \r\n" + "2.Hockey Player Details  ");
		System.out.println("Enter choice");
		int choice = Integer.parseInt(scn.nextLine());

		switch (choice) {
		case 1:
			if (choice == 1) {
				System.out.println("Enter player name");
				String name1 = scn.nextLine();
				System.out.println("Enter team name");
				String tname1 = scn.nextLine();
				System.out.println("Enter number of matches played    ");
				int match1 = Integer.parseInt(scn.nextLine());
				System.out.println("Enter Total Runs Score");
				int run = Integer.parseInt(scn.nextLine());
				System.out.println("Enter No of wickets taken");
				int wickets = Integer.parseInt(scn.nextLine());
				pr1 = new CricketPlayers(tname1, tname1, wickets, wickets, wickets);
				break;
			}

		case 2:
			if (choice == 2) {
				System.out.println("Enter player name");
				String name2 = scn.nextLine();
				System.out.println("Enter team name");
				String tname2 = scn.nextLine();
				System.out.println("Enter number of matches played    ");
				int match2 = Integer.parseInt(scn.nextLine());
				System.out.println("Enter the position  ");
				String position = scn.nextLine();
				System.out.println("Enter total number of goals taken  ");
				int goals = Integer.parseInt(scn.nextLine());
				pr2 = new HockeyPlayers(position, position, goals, position, goals);
				break;
			}
		default:
			System.out.println("Wrong Choice");

		}
		
		System.out.printf("Area of is:",pr1.displayPlayerStatistics());
		System.out.printf("Area of is:",pr2.displayPlayerStatistics());
		// pr1.displayPlayerStatistics();
		// pr2.displayPlayerStatistics();
	}
}