import java.util.regex.Pattern;
class Solution {
    public boolean solution(String s) {
        
        boolean answer = true;
        char[] strarr = s.toCharArray();
        if(strarr.length==4 ||strarr.length==6){
            String pattern = "^[0-9]*$"; // 숫자만 등장하는지
            answer = Pattern.matches(pattern, s);  
        }
        else{
            answer = false;
        }
        
        return answer;
    }
}