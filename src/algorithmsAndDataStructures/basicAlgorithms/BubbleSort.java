package algorithmsAndDataStructures.basicAlgorithms;

import java.util.Arrays;

import utils.Utils;

public class BubbleSort {

	private int[] bubbleSort(int[] lst, boolean descnding) {
		int temp;
		boolean found = false;
		do {
			found = false;
			for (int i = 0; i < lst.length - 1; i++) {
				if (descnding ? lst[i] < lst[i + 1] : lst[i] > lst[i + 1]) {
					found = true;
					temp = lst[i + 1];
					lst[i + 1] = lst[i];
					lst[i] = temp;
				}
			}
		} while (found == true);
		return lst;
	}

	private int[] bubbleSort(int[] lst) {
		return this.bubbleSort(lst, false);
	}

	public static void main(String[] args) {
		int[] lst = { 4, 9, 7, 1, 3, 6, 5 };
		BubbleSort bs = new BubbleSort();
		Utils utils = new Utils();

		lst = bs.bubbleSort(lst, true);
		utils.printArray(Arrays.stream(lst).boxed().toArray(Integer[]::new));
	}
}
