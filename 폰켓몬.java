// 너무 길어서.. 
// https://school.programmers.co.kr/learn/courses/30/lessons/1845

import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int length = nums.length / 2;
        HashMap<Integer, Integer> hm = new HashMap();
        for(int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }
        for(int x: hm.keySet()) {
        answer = Math.min(length, hm.size());
        }
        return answer;
    }
}
