// https://school.programmers.co.kr/learn/courses/30/lessons/42578#qna

// getOrDefault - 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
// getOrDefault(Object key, V DefaultValue)
// key : map 요소의 키이다.
// defaultValue : 지정된 키로 매핑된 값이 없거나 null이면 반환하는 기본 값이다.

import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++) {
            hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 1) + 1); // 같은 의상 종류 개수를 카운팅하여 value 에 넣어준다.
        }
        
        Collection<Integer> count = hm.values(); // 서로 다른 의상 종류 개수 확인
        
        answer = count.stream().reduce(1, (a, b) -> a * b) - 1; 
      
// 의상 조합 경우의 수 a, b, c = (a + 1)(b + 1)(c + 1) - 1  [ -1 은 아무것도 안 입을 경우의 수 제외 ]
        
        return answer;
    }
}
