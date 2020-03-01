package LeetCode;

public class P0342 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 16;
		System.out.println(isPowerOfFour(num));
	}
	
	public static boolean isPowerOfFour(int num) {
        if(num==0) 
            return false;
 
        if(num==1) 
            return true;

        if(num>1) 
            return num%4==0 && isPowerOfFour(num/4);
        else
            return false;
    }

}
