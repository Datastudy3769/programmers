class Solution {
    public String solution(int n) {
        String answer = "";
        char[] strarr = new char[n];
        for(int i =1 ; i<=n; i++){
            if(i%2==1){
                strarr[i-1]='수';
            }
            else if(i%2==0){
                strarr[i-1]='박';
            }
        }
        answer = String.valueOf(strarr);
        return answer;
    }
}