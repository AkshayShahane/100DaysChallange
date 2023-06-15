package Day_02;

import java.util.ArrayList;
import java.util.Arrays;
//this program is to remove duplicates from list
public class RemoveDuplicateNumFromList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(128,5,87,10,6,9,65,87,128,5));
		removeDuplicate(numbers);
	}
	
	public static void removeDuplicate(ArrayList<Integer> numbers) {
		ArrayList<Integer> uniqueList = new ArrayList<>();
		for(Integer number:uniqueList) {
			if(!uniqueList.contains(number)) {
				uniqueList.add(number);
			}
		}
		System.out.println(numbers);
	}
}
