package LeetCode;

public class P0326 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 27;
		
		System.out.println(isPowerOfThree(n));
	}
	
	public static boolean isPowerOfThree(int n) {
        
        if(n == 1) return true;
        
        while(n >= 3){
            int r = n%3;
            
            if(r==0){
                n = n/3;
                if(n==1){
                    return true;
                }
            }else{
                return false;
            }
        }
        
        return false;
    }

}
