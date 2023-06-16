package Day_03;

import java.util.Arrays;
import java.util.List;

public class Java8FeatureforEachMethod {

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(45,84,20,6,9415,54,24,981,50,21,54,30);
		al.forEach(i->System.out.println(i));
		
		
	}
}
