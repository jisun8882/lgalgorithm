
public class P0062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 2;
		
		System.out.println(uniquePaths(m,n));
	}
	
	public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                dp[i][j] = -1;
            }
        }
        
        return helper(dp, m-1, n-1);
    }
    
    private static int helper(int[][] dp, int m, int n){
        if(m==0||n==0){
            dp[m][n] = 1;
            return 1;
        }
        
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        
        dp[m][n] = helper(dp, m, n-1) + helper(dp, m-1, n);
        
        return dp[m][n];
    }

}
