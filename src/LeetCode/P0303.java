package LeetCode;

public class P0303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {-2,0,3,-5,2,-1};
		
		NumArray array = new NumArray(nums);
		
		System.out.println(array.sumRange(0, 2));
		System.out.println(array.sumRange(2, 5));
		System.out.println(array.sumRange(0, 5));

	}

}

class NumArray {

    private int[] sum;
    
    public NumArray(int[] nums) {
        sum = new int [nums.length+1];
        
        for(int i=0; i<nums.length; i++){
            sum[i+1] = sum[i] + nums[i];
        }
    }
    
    public int sumRange(int i, int j) {
        return sum[j+1] - sum[i];
    }
}
