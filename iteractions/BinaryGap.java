package codility.iteractions;

public class BinaryGap {

    public int solution(int N) {
        int ret = 0;
        String binString = Integer.toBinaryString(N);
        char[] arr = binString.toCharArray();
        boolean startZero = false;
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] == '1') {
        		while (true) {
        			i++;
        			if (i >= arr.length)
        				break;
        			if (arr[i] == '1') {
        				if (ret < tmp)
        					ret = tmp;
        				tmp = 0;
        				i--;
        				break;
        			} else {
        				tmp++;
        			}
        		}
        	}
        }
        return ret;
    }
	
	public static void main(String[] args) {
		BinaryGap bg = new BinaryGap();
		System.out.println(bg.solution(328));
	}

}
