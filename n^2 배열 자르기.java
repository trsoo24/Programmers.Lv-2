// https://school.programmers.co.kr/learn/courses/30/lessons/87390

// n = 4 일 때, 2차원배열에 
// 1 2 3 4
// 2 2 3 4
// 3 3 3 4
// 4 4 4 4 
// 위와 같은 방식으로 저장된다. 
// 행 열 값 중 높은 수 + 1 로 값이 저장됨
// 이 값을 1차원 배열로 저장했을때 {1, 2, 3, 4, 2, 2, 3, 4, 3, 3, 3, 4, 4, 4, 4, 4} 로 저장됨.
// 만약 left = 4, right = 7 일 경우, answer = {2, 2, 3, 4} 로 저장된다.

import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int [(int)(right - left) + 1];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) Math.max(left / n + 1, left % n + 1);
            left++;
        }
        
        return answer;
    }
}
