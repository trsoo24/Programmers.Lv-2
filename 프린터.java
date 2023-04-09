// https://school.programmers.co.kr/learn/courses/30/lessons/42587

// [2, 1, 3, 2]와 같은 작업 순서가 주어질 때, 현재 실행하려는 작업보다 우선순위가 더 큰 작업이 있는 경우에 현재 작업을 대기열의 맨 끝으로 보내준다.
// 문제를 읽고 직관적으로 큐를 사용해서 구현해야 하는 것을 알 수 있었다.
// 문제를 해결하기 위해 가장 중요한 것은 어떻게 우선순위가 더 큰 작업을 뒤로 보낼 것인가이다.
// 우선순위 큐를 사용하면 가장 간단하며, 일반 큐를 사용해도 된다.

import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = 
            new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        
        for (int i = 0; i < priorities.length; i++) {
            pq.add(priorities[i]);
        }
        
        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == pq.peek()) {
                    if (i == location) {
                        answer++;
                        return answer;
                    }
                    pq.poll();
                    answer++;
                }
            }
        }
        return answer;
    }
}
