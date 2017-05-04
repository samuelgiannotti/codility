package codility.countingElements;

import java.util.Arrays;

public class MissingInteger {

	public int solution(int[] A) {
		int ret = 1;
		Arrays.sort(A);
		for (int i = 0; i < A.length; i++) {
			if (ret < A[i]){
				return ret;
			} else {
				if (ret == A[i] || ret+1 == A[i])
					ret++;
			}
		}
		return ret;
	}
	
	public static void main(String[] args) {
		MissingInteger mi = new MissingInteger();
		//int[] a = {1, 3, 6, 4, 1, 2};
		int[] a = {1, 3, 6, 4, 1, 2, 6, 4, 7};
		//int[] a = {2};
		System.out.println(mi.solution(a));
	}

}
