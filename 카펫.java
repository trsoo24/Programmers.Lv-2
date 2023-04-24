// https://school.programmers.co.kr/learn/courses/30/lessons/42842

class Solution {
   public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        for (int i = 3; i < sum; i++) { //넓이가 9 이므로 i = 3 부터
            int j = sum / i;
            
            if (sum % i == 0 && j >= 3) {
                int col = Math.max(i, j); // 가로
                int row = Math.min(i, j); // 세로
                int center = (col - 2) * (row - 2);
                
                if (center == yellow) {
                    answer[0] = col;
                    answer[1] = row;
                    return answer;
                }
            }
        }
        return answer;
    }
}
