package codility.sort;

import java.util.Arrays;

public class Distinct {

	public int solution(int[] A) {
		int count = 0;
		Arrays.sort(A);
		int last = -1000001;
		for (int i = 0; i < A.length; i++) {
			if (A[i] != last) {
				count++;
			}
			last = A[i];
		}
		return count;
	}
	
	public static void main(String[] args) {
		Distinct d = new Distinct();
		int[] a = {2, 1, 1, 2, 3, 1};
		System.out.println(d.solution(a));

	}

}
