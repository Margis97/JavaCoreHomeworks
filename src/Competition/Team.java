package Competition;
import java.util.ArrayList;
import java.util.List;

public class Team {

	private String teamName;
	private List<Player> players;
	
	public Team(String teamName) {
		this.teamName = teamName;
		this.players = new ArrayList<>();
	}
	
	public void addPlayersIntoList(String name, int canGoCourse) {
		Player newPlayer = new Player(name, canGoCourse);
		players.add(newPlayer);
	}
	
	public void printAll() {
		for (int i = 0; i < players.size(); i++) {
			Player player = players.get(i);
			player.printInfo();
		}
	}

	public String getTeamName() {
		return teamName;
	}

	public List<Player> getPlayers() {
		return players;
	}
}
