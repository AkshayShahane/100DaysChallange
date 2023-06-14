package Day_01;

//If there are any duplicate number then return true otherwise return false
public class DuplicatesElementsFromArray {
	public static void main(String[] args) {
		int[] array = { 4, 8, 5, 7, 7, 0 };
		boolean findDuplicateOutput = findDuplicate(array);
		System.out.println(findDuplicateOutput);
	}

	public static boolean findDuplicate(int[] array) {
		for (int i = 0; i <= array.length - 1; i++) {
			for (int j = i + 1; j <= array.length - 1; j++) {
				if (array[i] == array[j]) {
					System.out.println(array[i]);
					return true;
				}
			}
		}
		return false;
	}
}
