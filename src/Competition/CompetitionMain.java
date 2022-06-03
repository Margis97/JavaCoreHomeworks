package Competition;

public class CompetitionMain {

	public static void main(String[] args) {
		Team team = new Team("Team1");
        team.addPlayersIntoList("John", 600);
        team.addPlayersIntoList("Kate", 300);
        team.addPlayersIntoList("Mary", 100);
        team.addPlayersIntoList("Molly", 90);
        team.printAll();
        
        Course course = new Course();
        course.addObstacleIntoList("jumping", 100);
        course.addObstacleIntoList("running", 300);
        course.addObstacleIntoList("swimming", 400);
        course.doIt(team);
	}
}
