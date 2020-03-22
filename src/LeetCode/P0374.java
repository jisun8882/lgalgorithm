package LeetCode;

public class P0374 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int guessNumber(int n) {
        
        int start = 1, end = n;
        
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(guess(mid) == 0) {
                return mid;
            } else if(guess(mid) == 1) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        
        return start;
    }

	private int guess(int mid) {
		// TODO Auto-generated method stub
		return 0;
	}

}
