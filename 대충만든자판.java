https://school.programmers.co.kr/learn/courses/30/lessons/160586

import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char idx = keymap[i].charAt(j);
                hm.put(idx, Math.min(hm.getOrDefault(idx, j + 1), j + 1));
            }
        }
        
        for (int x = 0; x < targets.length; x++) {
            for (int y = 0; y < targets[x].length(); y++) {
                char target = targets[x].charAt(y);
                
                if (!hm.containsKey(target)) {
                    answer[x] = -1;
                    break;
                } else {
                    answer[x] += hm.get(target);
                }
            }
        }
        
        return answer;
    }
}
