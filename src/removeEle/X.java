package removeEle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class X {

	public static void main(String[] args) {
		
		List<Integer> li=Arrays.asList(1,2,3,1,2,3);
		List<Integer> removeData = li.stream().distinct().collect(Collectors.toList());
		System.out.println(removeData);
	}
}
