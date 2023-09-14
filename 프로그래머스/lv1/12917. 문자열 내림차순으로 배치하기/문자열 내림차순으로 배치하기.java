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
//         char max =strarr[0];
        
//         for(int i =0; i<=s.length(); i++){
//             if(strarr[i]>=max){
//                 max = strarr[i];
//             }
//         }
        
        return answer;
    }
}