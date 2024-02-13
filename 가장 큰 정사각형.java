// https://school.programmers.co.kr/learn/courses/30/lessons/12905

// 0 1 1 1                                                                                                         0 1 1 1
// 1 1 1 1                                                                                                         1 1 2 2
// 1 1 1 1  와 같은 2차원 배열이 주어졌을 때, i 와 j 가 1보다 큰 배열 부터                                          1 2 2 3
// 0 0 1 0  board[i-1][j-1] , board[i-1][j] , board[i][j-1] 중 가장 작은 값 + 1 을 가지는 DP 방식을 활용한다        0 0 0 0

class Solution {
    public int solution(int [][]board) {
        int answer = 0;
        int side = 0;
        
        if (board.length < 2 || board[0].length < 2) { // board 넓이가 작은 예외 처리
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == 1) {
                        return 1;
                    }
                }
            }
            return 0;
        }
        
        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[i].length; j++) {
                if (board[i][j] != 0) {
                    board[i][j] = Math.min(board[i-1][j-1], Math.min(board[i-1][j], board[i][j-1])) + 1;
                }
                side = Math.max(side, board[i][j]);
            }
        }

        System.out.println("Hello Java");
        answer = side * side;
        
        return answer;
    }
}
