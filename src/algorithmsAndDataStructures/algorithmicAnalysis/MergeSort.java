package algorithmsAndDataStructures.algorithmicAnalysis;

import java.util.Arrays;

import utils.Utils;

public class MergeSort {

	int[] mergeSort(int[] lst) {
		int length = lst.length;
		int left[];
		int right[];

		if (length % 2 == 0) {
			left = new int[length / 2];
			right = new int[length / 2];
		} else {
			left = new int[length / 2];
			right = new int[length / 2 + 1];
		}

		for (int i = 0; i < length; i++) {
			if (i < length / 2) {
				left[i] = lst[i];
			} else {
				right[i - length / 2] = lst[i];
			}
		}

		if (left.length > 1)
			left = mergeSort(left);
		if (right.length > 1)
			right = mergeSort(right);

		return merge(left, right);
	}

	private int[] merge(int[] left, int[] right) {
		int[] merged = new int[left.length + right.length];

		int lftIndx = 0;
		int rightIndx = 0;
		int mergedIndx = 0;
		while (lftIndx < left.length && rightIndx < right.length) {
			if (left[lftIndx] < right[rightIndx]) {
				merged[mergedIndx++] = left[lftIndx++];
			} else {
				merged[mergedIndx++] = right[rightIndx++];
			}
		}

		while (lftIndx < left.length) {
			merged[mergedIndx++] = left[lftIndx++];
		}

		while (rightIndx < right.length) {
			merged[mergedIndx++] = right[rightIndx++];
		}

		return merged;
	}

	public static void main(String[] args) {
		int[] lst = { 4, 9, 7, 1, 3, 6, 5 };
		MergeSort ms = new MergeSort();
		Utils utils = new Utils();

		lst = ms.mergeSort(lst);
		utils.printArray(Arrays.stream(lst).boxed().toArray(Integer[]::new));
	}
}
