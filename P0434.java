package LeetCode;

public class P0434 {
	public int countSegments(String s) {
        s = s.trim();
        
        if(s == null || s.isEmpty()){
            return 0;
        }
        
        return s.split("\\s+").length;
    }
}
