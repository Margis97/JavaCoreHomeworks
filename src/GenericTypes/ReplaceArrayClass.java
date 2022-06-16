package GenericTypes;

public class ReplaceArrayClass <T> {
	T temp;

	public T[] replaceElements(T[] array, int a, int b) {
		temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		return array;
	}
}
