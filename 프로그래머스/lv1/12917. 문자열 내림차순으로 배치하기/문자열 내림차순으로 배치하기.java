import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] strarr = s.toCharArray();
        char[] newarr = new char[s.length()];
        Arrays.sort(strarr);
        for(int i =s.length()-1,j=0; i>=0 && j<=s.length(); i--,j++){
            newarr[j] = strarr[i];
        }
        answer = String.valueOf(newarr);        
        return answer;
    }
}
