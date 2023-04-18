package oddNumber;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {

	public static void main(String[] args) {
		List<Integer> odd=Arrays.asList(1,2,3,4,5,6);
		List<Integer> oddNumber = odd.stream().filter(x->x%2!=0).collect(Collectors.toList());
		System.out.println("Odd Number"+oddNumber);
	}
}
