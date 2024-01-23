// https://school.programmers.co.kr/learn/courses/30/lessons/42888

import java.util.*;

class Solution {
    public String[] solution(String[] records) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        HashMap<String, String> hm = new HashMap<>();
        
        for(int i = 0; i < records.length; i++) {
            String[] arr = records[i].split(" ");
            
            if (arr[0].equals("Enter")) {
                hm.put(arr[1], arr[2]);
            } else if (arr[0].equals("Change")) {
                hm.put(arr[1], arr[2]);
            }
        }
        
        for (int j = 0; j < records.length; j++) {
            String[] arr = records[j].split(" ");
            
            if(arr[0].equals("Enter")){
                list.add(hm.get(arr[1])+"님이 들어왔습니다.");
            }
            else if(arr[0].equals("Leave")){
                list.add(hm.get(arr[1])+"님이 나갔습니다.");
            }
        }
        
        answer = list.stream().toArray(String[]::new);
        
        return answer;
    }
}
