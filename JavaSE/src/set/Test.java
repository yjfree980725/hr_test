package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {
	/**
	 * (A-B)U(B-A)
	 */

	public static void main(String[] args) {
		
		Set<Integer> A = new HashSet<Integer>(Arrays.asList(1,2,3,4));
		Set<Integer> B = new HashSet<Integer>(Arrays.asList(1,2,5,6));
		
		
		Set<Integer> C = new HashSet<Integer>();
		Set<Integer> D = new HashSet<Integer>();
		
		A.removeAll(B);
		//System.out.println(A);
		C = A;
		
		A = new HashSet<Integer>(Arrays.asList(1,2,3,4));
		//System.out.println(A);
		
		B.removeAll(A);
		//System.out.println(B);
		D = B;
		
		//²¢¼¯
		C.addAll(D);
	
		System.out.println(C);

	}

}
