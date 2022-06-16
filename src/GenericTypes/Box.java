package GenericTypes;

import java.util.ArrayList;

public class Box <T extends Fruit> {

	private ArrayList<T> fruitsList;

	public Box(ArrayList<T> fruitsList) {
		this.fruitsList = fruitsList;
	}
	
	public Float getWeightList() {
		Float result = 0f;
		for (T t: getFruitsList()) {
			Float weight = t.getWeight();
			result = result + weight;
		}
		return result;
	}
	
	public Boolean compareBoxes(Box<?> another) {
		if (this.getWeightList().floatValue() == another.getWeightList().floatValue()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void toEmptyBox(Box<T> another) {
		System.out.println("текущая коробка до " + this.getWeightList());
		System.out.println("другая коробка до " + another.getWeightList());
		for (T t : this.getFruitsList()) {
			another.getFruitsList().add(t);
		}
		this.getFruitsList().clear();
		System.out.println("текущая коробка после " + this.getWeightList());
		System.out.println("другая коробка после " + another.getWeightList());
	}

	public ArrayList<T> getFruitsList() {
		return fruitsList;
	}
}
