// https://school.programmers.co.kr/learn/courses/30/lessons/42586
// 100일을 가정한 길이 100짜리 array를 만들고, 해당 일자에 몇개가 끝나는지 (day * speeds[i] < 100)
// 넣어서, 0이 아닌 값들만 모아서 다시 배열로 만들어서 리턴한다.

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] dayOfEnd = new int[100];
        int day = -1;
        
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (day * speeds[i]) < 100) {
                day++;
            }
            dayOfEnd[day]++;
        }
        
        return Arrays.stream(dayOfEnd).filter(i -> i != 0).toArray();
    }
}
