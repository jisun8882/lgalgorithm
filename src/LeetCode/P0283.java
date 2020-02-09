
public class P0283 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
		
		for(int i=0; i<nums.length; i++){
			System.out.print(nums[i]+" ");
		}
	}
	
	public static void moveZeroes(int[] nums) {
        int count = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[count++] = nums[i];
            }
        }
        
        while(count<nums.length){
            nums[count++] = 0;
        }
    }

}
