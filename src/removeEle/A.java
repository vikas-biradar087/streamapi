package removeEle;

import java.util.HashSet;

public class A {
	public static void main(String[] args) {
		
		int x[]= {1,2,3,4,5,1,2,3};
		
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<x.length;i++) {
			if(set.add(x[i])==false) {
				System.out.println(x[i]);
			}
		}
	}

}
