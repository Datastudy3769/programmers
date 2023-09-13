import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        int middle =s.length()%2;
        int mid = s.length()/2;
        char[] strarr = s.toCharArray();
        if(middle==1){
            char[] emp = new char[1];
            emp[0]=strarr[mid];
            answer = String.valueOf(emp);
        }
        else if(middle ==0){
            char[] emp = new char[2];
            emp[0]=strarr[mid-1];
            emp[1]=strarr[mid];   
            answer = String.valueOf(emp);
        }
        
        return answer;
    }
}