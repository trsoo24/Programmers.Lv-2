import java.util.*;

class Solution {
    static HashMap<String, Integer> hm = new HashMap<>();
    static List<String> list = new ArrayList<>();
    
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        
        // orders 알파벳 순 정렬
        for(int i = 0; i < orders.length; i++) {
            char[] arr = orders[i].toCharArray();
            Arrays.sort(arr);
            orders[i] = String.valueOf(arr);
        }
        
        for (int j = 0; j < course.length; j++) {
            for (int k = 0; k < orders.length; k++) {
                dfs("", course[j], orders[k]);
            }
            
            if (!hm.isEmpty()) {
                List<Integer> getMax = new ArrayList<>(hm.values());
                int max = Collections.max(getMax);
                
                if (max > 1) {
                    for (String key : hm.keySet()) {
                        if (hm.get(key) == max) {
                            list.add(key);
                        }
                    }
                }
                hm.clear();
            }
        }
        
        answer = list.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
    
    private void dfs(String word, int course, String order) {
        if (course == 0) {
            hm.put(word, hm.getOrDefault(word, 0) + 1);
        }
        
        for (int i = 0; i < order.length(); i++) {
            dfs(word + order.charAt(i), course - 1, order.substring(i + 1));
        }
    }
}
