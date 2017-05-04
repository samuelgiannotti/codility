package codility.prefixSums;

public class CountDiv {

	public int solution(int A, int B, int K) {
		int ret = 0;
		int min = 0;
		int max = 0;
		for (int i = A; i <= B; i++) {
			if (i % K == 0) {
				min = i/K;
				break;
			}
		}
		for (int i = B; i >= A; i--) {
			if (i % K == 0) {
				max = (i/K)+1;
				break;
			}			
		}
		ret = max - min;
		return ret;
	}
	
	public static void main(String[] args) {
		CountDiv cd = new CountDiv();
		System.out.println(cd.solution(6, 11, 2));
		System.out.println(cd.solution(4, 11, 2));
		System.out.println(cd.solution(0, 0, 11));
		System.out.println(cd.solution(1, 1, 11));
	}

}
