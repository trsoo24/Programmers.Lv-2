// https://school.programmers.co.kr/learn/courses/30/lessons/12981#qna

// 이전에 한번 나온 단어이거나, 끝말잇기 룰을 어길 경우 그 사람이 몇번째 사람이고 몇바퀴째에 틀렸는지 출력하는 문제
// 2중 for 문을 사용 시, 2명이 틀렸을 경우 먼저 틀린 사람을 체크할 수 없었다. 그래서 Set 을 이용하여 중복을 체크함과 동시에 앞 단어와 끝말잇기 룰을 지켰는지 체크

import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {};
        int cnt = 1;
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        
        for(int i = 1; i < words.length; i++) {
            if(set.contains(words[i])) {
                break;
            }
            if(words[i].charAt(0) == 
               words[i - 1].charAt(words[i - 1].length() - 1)) {
                set.add(words[i]);
                cnt++;
            } else {
                break;
            }
        }
        
        if(cnt == words.length)  {
            answer = new int[] {0, 0};
        } else {
            answer = new int[] {cnt % n + 1, cnt / n + 1};
            }
        
        return answer;
    }
}
