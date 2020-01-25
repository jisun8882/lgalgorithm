package LeetCode;

import java.util.Arrays;

public class P0268 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,0,1};
		
		System.out.print(missingNumber(nums));

	}
	
	public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++){
            if (nums[i] != i){
                return i;
            } 
        }
        
        return nums.length;
    }
}
