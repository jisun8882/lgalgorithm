package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class P0095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<TreeNode> tree = generateTrees(n);

	}
	
	public static List<TreeNode> generateTrees(int n) {
        if(n==0){
            return new ArrayList<TreeNode>();
        }
        
        return helper(1,n);
    }
    
    public static List<TreeNode> helper(int m, int n){
        List<TreeNode> result = new ArrayList<TreeNode>();
        if(m>n){
            result.add(null);
            return result;
        }
        
        for(int i=m; i<=n; i++){
            List<TreeNode> left = helper(m, i-1);
            List<TreeNode> right = helper(i+1, n);
            for(TreeNode l : left){
                for(TreeNode r : right){
                    TreeNode cur = new TreeNode(i);
                    cur.left = l;
                    cur.right = r;
                    result.add(cur);
                }
            }
        
        }
        
        return result;
        
    }

}
