package stringSorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
	
	public static void main(String[] args) {
		
		
		// Start with
//	    List<String> names = Arrays.asList("Reflection","Collection","Stream");
//	    List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
//	    System.out.println(result);
	
	
	
		//End with
//    List<String> names = Arrays.asList("Reflection","Collection","Stream");
//    List<String> result = names.stream().filter(s->s.endsWith("n")).collect(Collectors.toList());                      
//    System.out.println(result);
//    
    
		
		//Occurance the string
//		List<String> names = Arrays.asList("Reflection","Collection","Stream","vikas","vikas");
//	    List<String> result = names.stream().filter(s->s.equals("vikas")).collect(Collectors.toList());                      
//	    System.out.println(result.size());
		
		//upper case
//		List<String> friends = Arrays.asList("Ross", "Chandler", "CSS", "Monica", "Joey", "Rachel");
//		List<String> upCase = friends.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
//		System.out.println(upCase);
//    
		
		List<String> friends = Arrays.asList("ROSS", "CCC", "CSS", "MONICA", "JJJ", "RA");
		List<String> upCase = friends.stream().map(name -> name.toLowerCase()).collect(Collectors.toList());
		System.out.println(upCase);
    
}
}
