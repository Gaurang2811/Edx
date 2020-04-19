package utils;

public class Utils {

	public <E> void printArray(E[] lst) {
		System.out.println("Printing Array");
		for (int i = 0; i < lst.length; i++) {
			System.out.print(lst[i].toString() + ", ");
		}
		System.out.println();
	}
}
