package sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
	
	public static void main(String[] args) {
		List<Integer> sort=Arrays.asList(3,2,1,6,5,4);
		List<Integer> sortNumber = sort.stream().sorted().collect(Collectors.toList());
		System.out.println("Sort Array"+" "+sortNumber);
	}

}
