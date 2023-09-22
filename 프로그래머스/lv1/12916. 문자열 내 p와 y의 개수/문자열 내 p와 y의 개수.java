class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        s=s.toUpperCase(); //대문자로 변환
        for(int i = 0 ; i<s.length(); i++){
            if(s.charAt(i) == 'P') p++;  //순회하며 문자 비교, 같으면 카운트
            else if(s.charAt(i)=='Y') y++;
        }
        if(p==y) answer =true;
        else answer = false;
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}