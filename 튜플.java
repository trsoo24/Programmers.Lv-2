// https://school.programmers.co.kr/learn/courses/30/lessons/64065#qna
// 셀수있는 수량의 순서있는 열거 또는 어떤 순서를 따르는 요소들의 모음을 튜플(tuple)이라고 합니다.  ... 

// HashMap 에 문자열에 등장하는 값들을 key 로, 횟수를 value 로 지정
// List 에 HashMap value 값의 내림차순으로 저장 후 Array 로 변환

import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        
        String word = s.replaceAll("[{}]","");
        String[] split = word.split(",");
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < split.length; i++) {
            int a = Integer.parseInt(split[i]);
            if (!map.containsKey(a)) {
                map.put(a, 1);
            } else {
                map.put(a, map.get(a) + 1);
            }
        }
        List<Integer> list = new ArrayList(map.keySet());
        Collections.sort(list, (o1, o2) -> 
                         Integer.compare(map.get(o2), map.get(o1)));
        
        answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}
