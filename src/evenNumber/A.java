package evenNumber;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
	
	public static void main(String[] args) {
		List<Integer> even=Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> evenNumber = even.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("Even number"+" "+evenNumber);
	}

}
