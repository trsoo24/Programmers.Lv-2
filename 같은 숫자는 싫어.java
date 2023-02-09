// 배열 매개변수에서 연속된 수는 제거한 배열을 표시

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(arr[0]);
      
        for(int i = 1; i < arr.length; i++) {
                if(arr[i - 1] != arr[i]) {
                    queue.offer(arr[i]);
                }
        }
        
        int[] answer = new int[queue.size()];
      
        for(int j = 0; j < answer.length; j++) {
            answer[j] = queue.poll();
        }
      
        return answer;
    }
}
