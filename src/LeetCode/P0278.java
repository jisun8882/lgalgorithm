package LeetCode;

public class P0278 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println(firstBadVersion(n));
	}
	
	public static int firstBadVersion(int n) {
        
        int left = 1;
        int right = n;
        
        while(left<right){
            int mid = left + (right - left) / 2;
           /* if(isBadVersion(mid)){
                right = mid;
            }else{
                left = mid+1;
            }*/
        }
        
        return left;
    }

}
