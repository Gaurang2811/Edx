package algorithmsAndDataStructures.algorithmicAnalysis;

import java.util.Arrays;

import utils.Utils;

public class BinarySearch {
	private int binarySearch(int[] lst, int num, int start, int last) {
		if (last < start) {
			return -1;
		}

		int midIndx = (start + last) / 2;
		if (midIndx > lst.length - 1) {
			return -1;
		}
		if (lst[midIndx] == num) {
			return midIndx;
		} else if (lst[midIndx] < num) {
			return binarySearch(lst, num, midIndx + 1, last);
		} else {
			return binarySearch(lst, num, start, midIndx - 1);
		}
	}

	private int binarySearch(int[] lst, int num) {
		return this.binarySearch(lst, num, 0, lst.length);
	}

	public static void main(String[] args) {
		int[] lst = { 4, 9, 7, 1, 3, 6, 5 };
		MergeSort ms = new MergeSort();
		BinarySearch bs = new BinarySearch();
		Utils utils = new Utils();

		lst = ms.mergeSort(lst);
		utils.printArray(Arrays.stream(lst).boxed().toArray(Integer[]::new));

		System.out.println(bs.binarySearch(lst, 0));
		System.out.println(bs.binarySearch(lst, 1));
		System.out.println(bs.binarySearch(lst, 3));
		System.out.println(bs.binarySearch(lst, 4));
		System.out.println(bs.binarySearch(lst, 5));
		System.out.println(bs.binarySearch(lst, 6));
		System.out.println(bs.binarySearch(lst, 7));
		System.out.println(bs.binarySearch(lst, 9));
		System.out.println(bs.binarySearch(lst, 11));
	}
}
