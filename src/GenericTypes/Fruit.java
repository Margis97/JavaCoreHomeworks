package GenericTypes;

public abstract class Fruit {
	
    private String name;
    private Float weight;
    
	public Fruit(String name, Float weight) {
		this.name = name;
		this.weight = weight;
	}
    
    public String getName() {
		return name;
	}
    
    public Float getWeight() {
		return weight;
	}
}
