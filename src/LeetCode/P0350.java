package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class P0350 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num1 = {4,9,5};
		int[] num2 = {9,4,9,8,4};
		
		int[] result = intersect(num1, num2);
		
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+ " ");
		}
		
	}
	
	public static int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i: nums1){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i: nums2){
            if(map.containsKey(i)){
                if(map.get(i)>1){
                    map.put(i, map.get(i)-1);
                }else{
                    map.remove(i);
                }
                list.add(i);
            }
        }
        
        int[] result = new int[list.size()];
        
        int i =0;
        
        while(i<list.size()){
            result[i]=list.get(i);
            i++;
        }
        
        return result;
    }

}
