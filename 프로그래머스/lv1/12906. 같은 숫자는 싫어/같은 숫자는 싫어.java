import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        
        int num = -1;       //배열의 원소의 크기가 0~9이므로 해당하지 않는 수 -1 할당
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=num){
                arrlist.add(arr[i]);  //num과 같으면 ArrayList에 삽입, num에 배열 값 할당
                num = arr[i];
            }
        }
        
        answer = new int[arrlist.size()];       //answer 재정의 => arrlist의 크기만큼
        for(int i = 0; i<answer.length; i++){
            answer[i] = arrlist.get(i);
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}