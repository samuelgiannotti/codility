package codility.arrays;

public class CyclicRotation {

	public int[] solution(int[] A, int K) {
		if (A.length == 0)
			return A;
		while (K > A.length) {
			K = K - A.length;
		}
		int[] ret = new int[A.length];
		int aIndex = A.length-K;
		for (int i = 0; i < ret.length; i++) {
			if (aIndex >= A.length)
				aIndex = 0;
			ret[i] = A[aIndex];
			aIndex++;
		}
		return ret;
	}
	
	public static void main(String[] args) {
		CyclicRotation cr = new CyclicRotation();
		int[] a = {1, 2, 3, 4};
		int[] b = cr.solution(a, 3);
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i]+" ");

	}

}
