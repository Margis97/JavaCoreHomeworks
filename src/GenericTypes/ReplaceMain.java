package GenericTypes;

import java.util.Arrays;

public class ReplaceMain {

	static String[] strArray = {"I", "love", "cats"};
	static Integer[] intArray = {1, 2, 3};

	public static void main(String[] args) {

		ReplaceArrayClass<String> replaceStrArray = new ReplaceArrayClass<>();    	
		System.out.println(Arrays.toString(replaceStrArray.replaceElements(strArray, 0, 1)));

		ReplaceArrayClass<Integer> replaceIntArray = new ReplaceArrayClass<>();
		System.out.println(Arrays.toString(replaceIntArray.replaceElements(intArray, 0, 1)));
	}
}
