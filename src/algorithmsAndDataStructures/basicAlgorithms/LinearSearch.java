package algorithmsAndDataStructures.basicAlgorithms;

public class LinearSearch {

	private int linearSearch(int[] lst, int num) {
		for (int i = 0; i < lst.length; i++) {
			if (lst[i] == num) {
				return i + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] lst = { 4, 9, 7, 1, 3, 6, 5 };
		LinearSearch ls = new LinearSearch();
		System.out.println(ls.linearSearch(lst, 1));
		System.out.println(ls.linearSearch(lst, 0));
	}
}
