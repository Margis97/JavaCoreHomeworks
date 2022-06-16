package GenericTypes;

import java.util.ArrayList;
import java.util.List;

public class FruitMain {
	
	public static void main(String[] args) {
		ArrayList<Apple> applesList = new ArrayList<>();
		
	    Apple apple1 = new Apple(1.0f);
	    Apple apple2 = new Apple(1.0f);
	    Apple apple3 = new Apple(1.0f);
	    Apple apple4 = new Apple(1.0f);
	    applesList.add(apple1);
	    applesList.add(apple2);
	    applesList.add(apple3);
	    applesList.add(apple4);
	    Box<Apple> appleBox = new Box<>(applesList);
	    
	    System.out.println(appleBox.getWeightList());
	    
	    ArrayList<Orange> orangesList = new ArrayList<>();
	    Orange orange1 = new Orange(1.5f);
	    Orange orange2 = new Orange(1.5f);
	    Orange orange3 = new Orange(1.5f);
	    Orange orange4 = new Orange(1.5f);
	    orangesList.add(orange1);
	    orangesList.add(orange2);
	    orangesList.add(orange3);
	    orangesList.add(orange4);
	    Box<Orange> orangeBox = new Box<>(orangesList);
	    
	    System.out.println(orangeBox.getWeightList());
	    System.out.println(appleBox.compareBoxes(orangeBox));
	    
	    
        ArrayList<Apple> applesList1 = new ArrayList<>();
		
	    Apple apple5 = new Apple(2.0f);
	    Apple apple6 = new Apple(1.0f);
	    Apple apple7 = new Apple(1.0f);
	    Apple apple8 = new Apple(1.0f);
	    applesList1.add(apple5);
	    applesList1.add(apple6);
	    applesList1.add(apple7);
	    applesList1.add(apple8);
	    Box<Apple> appleBox1 = new Box<>(applesList1);
	    
	    appleBox.toEmptyBox(appleBox1);
	}
	

}
