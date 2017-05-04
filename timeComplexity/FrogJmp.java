package codility.timeComplexity;

public class FrogJmp {

	public static int solution(int X, int Y, int D) {
		int gap = Y - X;
		int jumps = gap / D; 
		if (gap % D == 0)
			return jumps;
		else
			return jumps+1;
	}
	
	public static void main(String[] args) {
		
		System.out.println(solution(10, 85, 30));

	}

}
