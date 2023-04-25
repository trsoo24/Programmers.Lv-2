// https://school.programmers.co.kr/learn/courses/30/lessons/12982

// 예산 내로 최대한 얼마나 많은 부서에 지원이 가능한가 문제인데,
// 문제 오류로 부서 최대값만 구하면 되는 문제이다.
// 예를 들어, 최대한 예산에 가깝게 지원해야되는 문제가 나온다면 이분 탐색을 이용하여 풀이하는 것이 더 좋을 것 같다.

import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int check = 0;
        Arrays.sort(d);
        
        for (int i = 0; i < d.length; i++) {
            check += d[i];
            answer++;
            if (check > budget) {
                answer--;
                break;
            }
        }
        return answer;
    }
}
