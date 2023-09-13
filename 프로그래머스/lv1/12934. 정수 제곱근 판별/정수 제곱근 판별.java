class Solution {
    public long solution(long n) {
        long answer = 0;
        for(long i=1;i<=n;i++){
            if(Math.sqrt(n)== i){
                answer = (i+1)*(i+1);
                break;
            }else if(Math.sqrt(n)!= i){
             answer=-1;  
            }
        }
        return answer;
    }
}