package LeetCode;

public class P0010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aa";
		String p = "a";
		
		System.out.println(isMatch(s,p));
	}
	
	public static boolean isMatch(String s, String p) {
		
		if(p.length() == 0) {
			return s.length() == 0;
		}
		
		if(p.length() == 1 || p.charAt(1) != '*') {
			if(s.length()<1) {
				return false;
			}else if((p.charAt(0) != s.charAt(0)) && p.charAt(0) != '.') {
				return false;
			} else {
				return isMatch(s.substring(1), p.substring(1));
			}
		}else {
			if(isMatch(s, p.substring(2))) {
				return true;
			}
			
			int i=0;
			while(i<s.length()&&(s.charAt(i)==p.charAt(0)||p.charAt(0)=='.')) {
				if(isMatch(s.substring(i+1),p.substring(2))) {
					return true;
				}
				i++;
			}
			
			return false;
			
		}
		

    }

}
