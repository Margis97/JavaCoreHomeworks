package Competition;
import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private String result;
	private List<Obstacle> obstacles = new ArrayList<>();
	
	public void addObstacleIntoList(String name, int value) {
		Obstacle newObstacle = new Obstacle(name, value);
		obstacles.add(newObstacle);
	}

	public String doIt(Team team) {
		result = "Team number: " + team.getTeamName() + '\n';
		for (Player player : team.getPlayers()) {
			result = "Player's name: " + player.getName() + " ";
			int value = player.getCanGoCourse();
			testCourse(value);
		}
		return result;
	}
    
    private void testCourse(int value) {
    	for (int i = 0; i < obstacles.size(); i++) {
    		Obstacle someObstacle = obstacles.get(i);
    		if (value >= someObstacle.value) {
    			printWhoFinished(result);
    			
    		}
    	}
	}
    
//    private void testRunning(int value) {
//    	for (int i = 0; i < obstacles.size(); i++) {
//    		Obstacle someObstacle = obstacles.get(i);
//    		if (value >= someObstacle.value) {
//    			printWhoFinished(result);
//    			
//    		}
//    	}
//	}
//    
//    private void testSwimming(int value) {
//    	for (int i = 0; i < obstacles.size(); i++) {
//    		Obstacle someObstacle = obstacles.get(i);
//    		if (value >= someObstacle.value) {
//    			printWhoFinished(result);
//    			
//    		}
//    	}
//	}
    
    public void printWhoFinished(String result) {
    	System.out.println(result += "finished");
    }
}
