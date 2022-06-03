package Competition;

public class Player {
	
	private String name;
    private int canGoCourse;
    
	public Player(String name, int canGoCourse) {
		this.name = name;
		this.canGoCourse = canGoCourse;
	}
    
	public void printInfo() {
		System.out.println("Player: " + name + " can go " + canGoCourse);
	}
	
	public String getName() {
		return name;
	}

	public int getCanGoCourse() {
		return canGoCourse;
	}
}
