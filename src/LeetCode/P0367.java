package LeetCode;

public class P0367 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 14;
		
		System.out.println(isPerfectSquare(input));
	}
	
	public static boolean isPerfectSquare(int num) {
        long sum = 0;
        for (int i = 1; sum < num; i = i + 2) {
            sum = sum + i;
            if (sum == num) {
                return true;
            }
        }
        return false;
    }

}
