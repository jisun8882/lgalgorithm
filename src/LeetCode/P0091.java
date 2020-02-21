package LeetCode;

public class P0091 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "12";
		
		System.out.println(numDecodings(s));

	}
	
	public static int numDecodings(String s) {
        if(s.charAt(0) == '0') return 0;
        
        int[] dp = new int[s.length()+1];
        
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i=2; i<=s.length(); i++){
            if(s.charAt(i-1) == '0'){
                if(s.charAt(i-2) != '1' && s.charAt(i-2) != '2'){
                    return 0;
                }
                dp[i] = dp[i-2];
            }else{
                if(s.charAt(i-2) == '0' || Integer.valueOf(s.substring(i - 2, i)) > 26){
                    dp[i] = dp[i-1];
                }else{
                    dp[i] = dp[i-1] + dp[i-2];
                }
            } 
        }
        
        return dp[s.length()];
    }

}
