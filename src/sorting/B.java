package sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B {
	
	public static void main(String[] args) {
		
		String x[]= {"a","b","d","c","e"};
		
		List<String> sort=Arrays.asList(x);
		List<String> sortString = sort.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorting given String"+" "+sortString);
	}

}
