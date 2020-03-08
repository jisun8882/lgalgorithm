package LeetCode;

public class P0096 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println(numTrees(n));

	}
	
	public static int numTrees(int n) {
        int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				dp[i] += dp[j - 1] * dp[i - j];
		}
		return dp[n];
    }

}
