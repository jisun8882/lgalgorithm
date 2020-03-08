package LeetCode;

import java.util.HashSet;

public class P0349 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2, 2};
		
		int[] result = intersection(nums1,nums2);
		
		for(int i=0; i<result.length; i++){
			System.out.print(result[i]+ " ");
		}
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set1 = new HashSet<Integer>();
        
        for(int i: nums1){
            set1.add(i);
        }
        
        HashSet<Integer> set2 = new HashSet<Integer>();
        
        for(int i: nums2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }
        
        int[] result = new int[set2.size()];
        
        int i=0;
        
        for(int n: set2){
            result[i++] = n;
        }

        return result;
        
    }

}
