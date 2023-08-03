// https://school.programmers.co.kr/learn/courses/30/lessons/42583

// 내 상상 속에 트럭은 1초만에 다리를 지날 수가 없어서 힘들었다

import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        int total = 0;
        
        for (int i = 0; i < truck_weights.length; i++) {
            while (true) {
                if (queue.isEmpty()) {
                    queue.offer(truck_weights[i]);
                    total += truck_weights[i];
                    answer++;
                    break;
                } else if (queue.size() == bridge_length) {
                    total -= queue.poll();
                } else {
                    if (total + truck_weights[i] > weight) {
                        queue.offer(0);
                        answer++;
                    } else {
                        queue.offer(truck_weights[i]);
                        total += truck_weights[i];
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer + bridge_length;
    }
}
