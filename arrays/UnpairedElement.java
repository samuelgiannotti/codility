package codility.arrays;

import java.util.HashMap;

public class UnpairedElement {

    public int solution(int[] A) {
    	java.util.HashMap<Integer, Integer> map = new java.util.HashMap<Integer, Integer>();
    	for (int i = 0; i < A.length; i++) {
    		if (map.containsKey(A[i]))
    			map.remove(A[i]);
    		else
    			map.put(A[i], 0);
    	}
    	Integer ret = map.keySet().iterator().next();
    	return ret;
    }
	
	public static void main(String[] args) {
		UnpairedElement ue = new UnpairedElement();
		int[] a = {3,1,12,1,3};
		System.out.println(ue.solution(a));
	}

}
