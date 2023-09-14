class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long pay = 0;
        
        for(int i = 1; i<count +1 ; i++){ 
            pay = pay+ i*price; 
        }
        if(pay>money){
            answer = pay-money;
        }
        
        return answer;
    }
}