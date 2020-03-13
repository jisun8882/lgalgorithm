package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P0120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		
		List<Integer> tr1 = new ArrayList<Integer>();
		List<Integer> tr2 = new ArrayList<Integer>();
		List<Integer> tr3 = new ArrayList<Integer>();
		List<Integer> tr4 = new ArrayList<Integer>();
		
		tr1.add(2);
		tr2.add(3);
		tr2.add(4);
		tr3.add(6);
		tr3.add(5);
		tr3.add(7);
		tr4.add(4);
		tr4.add(1);
		tr4.add(8);
		tr4.add(5);
		
		
		triangle.add(tr1);
		triangle.add(tr2);
		triangle.add(tr3);
		triangle.add(tr4);
		
		System.out.println(minimumTotal(triangle));
	}
	
	public static int minimumTotal(List<List<Integer>> triangle) {
        
		for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < i + 1; j++) {
                int old = triangle.get(i).get(j);
                triangle.get(i).set(j, Math.min(triangle.get(i+1).get(j)
                                , triangle.get(i+1).get(j+1))+old);
            }
        }
        return triangle.get(0).get(0);
    }
	

}
