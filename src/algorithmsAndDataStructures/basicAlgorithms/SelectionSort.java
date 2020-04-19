package algorithmsAndDataStructures.basicAlgorithms;

import java.util.Arrays;

import utils.Utils;

public class SelectionSort {

	private int[] selectionSort(int[] lst, boolean descnding) {
		int temp;
		for (int i = 0; i < lst.length; i++) {
			for (int j = i; j < lst.length; j++) {
				if (descnding ? lst[i] < lst[j] : lst[i] > lst[j]) {
					temp = lst[j];
					lst[j] = lst[i];
					lst[i] = temp;
				}
			}
		}
		return lst;
	}

	private int[] selectionSort(int[] lst) {
		return this.selectionSort(lst, false);
	}

	public static void main(String[] args) {
		int[] lst = { 4, 9, 7, 1, 3, 6, 5 };
		SelectionSort ss = new SelectionSort();
		Utils utils = new Utils();

		lst = ss.selectionSort(lst);
		utils.printArray(Arrays.stream(lst).boxed().toArray(Integer[]::new));
	}
}
