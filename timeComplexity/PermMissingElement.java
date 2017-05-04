package codility.timeComplexity;

public class PermMissingElement {

    public int solution(int[] A) {
        int ret = 1;
        java.util.Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
        	if (A[i] != i+1)
        		return i+1;
        }
        return ret;
    }
    
    public int solution2(int[] A) {
	    int result = A.length + 1;
	    for ( int i = 0; i < A.length; i++) {
	        result = result - A[i] + i + 1;
	    }
	    return result;
    }
	
	public static void main(String[] args) {
		PermMissingElement pme = new PermMissingElement();
		int[] a = {2,3,5,4};
		System.out.println(pme.solution(a));
	}

}
