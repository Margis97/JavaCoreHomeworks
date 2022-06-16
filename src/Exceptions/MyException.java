package Exceptions;

import java.util.Arrays;

public class MyException {

	static int a = 4;
	static int b = 4;
	static String[][] array4x4 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"8", "7", "6", "5"}, {"4", "3", "2", "1"}};
	static String[][] array2x2 = {{"1", "2"}, {"3", "4",}, {"5", "6"}, {"7", "8"}};
	static String[][] arrayWrongData = {{"1", "f", "3", "4"}, {"5", "6", "7", "8"}, {"8", "7", "6", "5"}, {"4", "3", "2", "1"}};

	public static void main(String[] args) {

		try {
			System.out.println("Array summ: " + getSum(array4x4));
		} catch (MyArraySizeException | MyArrayDataException e){
			System.out.println(e.getMessage());
		}

		try {
			System.out.println("Incorrect size: " + getSum(array2x2));
		} catch (MyArraySizeException | MyArrayDataException e){
			System.out.println(e.getMessage());
		}

		try {
			System.out.println("Wrong data. " + getSum(arrayWrongData));
		} catch (MyArraySizeException | MyArrayDataException e){
			System.out.println(e.getMessage());
		}
	}

	public static void test(String[][] array) throws MyArraySizeException {
		if (array.length != a || array[0].length != b) throw new MyArraySizeException(" it's not an array 4x4 ");
	}

	public static int getSum(String[][] array) throws MyArrayDataException, MyArraySizeException { 
		test(array);
		int summ = 0;
		int i = 0;
		int j = 0;
		try {
			for (i = 0; i < array.length; i++) {
				for (j = 0; j < array[i].length; j++) {
					summ += Integer.parseInt(array[i][j]);			
				}
			}
		} catch (NumberFormatException ne) {
			throw new MyArrayDataException("Incorrect element type in " + i + ";" + j);
		}
		return summ;
	}
}
