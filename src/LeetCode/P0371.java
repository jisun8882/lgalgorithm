package LeetCode;

public class P0371 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		int b = 2;
		
		System.out.println(getSum(a,b));
	}
	
	public static int getSum(int a, int b) {
        while(b!=0){
            
            int c = a&b;
            a = a^b;
            b = c<<1;
        }
        
        return a;
    }

}
