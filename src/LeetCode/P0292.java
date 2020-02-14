package LeetCode;

public class P0292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		
		System.out.println(canWinNim(n));

	}
	
    public static boolean canWinNim(int n) {
        if(n%4 == 0){
            return false;
        }else{
            return true;
        }
    }

}
