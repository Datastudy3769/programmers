class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int lent = t.length();      //문자열 t의 길이
        int lenp = p.length();      //문자열 p의 길이
        
        //문자열 p를 Long으로 변환(최대 18자리이므로)
        Long nump = Long.parseLong(p);
        String s ="";
        int count =0;
        
        for(int i =0; i<=lent-lenp; i++){
            Long nums = Long.parseLong(t.substring(i,i+lenp)); 
            if(nums<=nump){
                count+=1;       //정수형으로 변환한 값이 p값보다 작은경우 카운트 +1
            }
        }    
        answer =count;
        return answer;
    }
}