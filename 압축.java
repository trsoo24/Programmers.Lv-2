// https://school.programmers.co.kr/learn/courses/30/lessons/17684

import java.util.*;

class Solution {
	public int[] solution(String msg) {
        ArrayList<Integer> compress = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();
      
        initDic(hm);
        
        int idx = 27;
        boolean isEnd = false;

        for(int i = 0 ; i < msg.length() ; i++) {
            String word = msg.charAt(i) + "";
            
            while(hm.containsKey(word)){
                i++;
                if(i == msg.length()) {
                	isEnd = true;
                	break;
                }
                word += msg.charAt(i);
            }
            
            if(isEnd) {
            	compress.add(hm.get(word));
            	break;
            }
            
            compress.add(hm.get(word.substring(0, word.length() - 1)));
            hm.put(word, idx++);
            
            i--;
        }
        
        int[] answer = new int[compress.size()];
        for(int j = 0 ; j < answer.length ; j++){
            answer[j] = compress.get(j);
        }
      
        return answer;
    }
    
    public void initDic(HashMap<String, Integer> hm) {
        char ch = 'A';
        
        for(int i = 1 ; i < 27 ; ++i){
            hm.put(ch + "", i);
            ch += 1;
        }
    }
}
