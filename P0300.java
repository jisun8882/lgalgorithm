package LeetCode;

public class P0300 {
	public int lengthOfLIS(int[] nums) {
        int d[] = new int[nums.length];
        int len = 0;
        for(int i=0; i<nums.length; i++){
            if(d[i] == 0){
                int max = 0;
                for(int j=0; j<i; j++){
                    if(nums[i]>nums[j]) max = Math.max(max,d[j]);
                }
                d[i] = max+1;
                len = Math.max(len,d[i]);
            }
        }
        
        return len;
    }
}
