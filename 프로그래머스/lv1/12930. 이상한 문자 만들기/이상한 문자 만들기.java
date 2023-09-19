class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strarr = s.split("");  //문자열을 분리
        int idx=0;
        for(int i =0; i<strarr.length;i++){
            if(strarr[i].equals(" ")){
                idx=0;
            }else if(idx%2==0){
                strarr[i]=strarr[i].toUpperCase(); //대문자 변경
                idx++;
            }else if(idx%2 !=0){
                strarr[i]=strarr[i].toLowerCase();  //소문자 변경
                idx++;
            }
            answer +=strarr[i];
        }  
        return answer;
    }
}