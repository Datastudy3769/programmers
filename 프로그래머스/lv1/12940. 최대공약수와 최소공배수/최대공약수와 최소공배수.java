class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int yacksu =0;
        int besu = 0;
        //최대 공약수 찾기
        //가장 큰 값을 찾아야 하므로 탈출문 없어도 됨
        for(int i=1; i<=n; i++){
            if(n%i==0 && m%i==0){
                yacksu=i;                 
            }
        }
        
        //최소 공배수 찾기
        //가장 작은 값이므로 찾자마자 탈출해야함
        for(int i =1; i<=n*m;i++){
            if(i%n==0 && i%m==0){
                besu = i;
                break;
            }
        }
        
        answer = new int[]{yacksu,besu};
        return answer;
    }
}