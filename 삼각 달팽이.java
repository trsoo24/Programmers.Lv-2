// 틀린 풀이법인데, 수정을 위해 기록
// 정수 n이 매개변수로 주어집니다. 다음 그림과 같이 밑변의 길이와 높이가 n인 삼각형에서 맨 위 꼭짓점부터 반시계 방향으로 달팽이 채우기를 진행한 후,
// 첫 행부터 마지막 행까지 모두 순서대로 합친 새로운 배열을 return 하도록 solution 함수를 완성해주세요.
//        1                  1
//       2  9               2 12
//     3  10  8           3  13 11
//    4  5  6  7         4 14 15 10
//                      5  6  7  8  9

class Solution {
    int cnt = 1;
    int x = 0;
    int y = 0;
    
    public int[] solution(int n) {
        int size = 0;
        for (int v = 1; v <= n; v++) {
            size += v;
        }
        int[] answer = new int[size];
        int[][] triangle = new int[n][n];
        int move = 0;
        while (move < n) {
            triangle = down(triangle, n);
            move++;
            triangle = straight(triangle, n);
            move++;
            triangle = up(triangle, n);
            move++;
        }
        
        int floor = 1;
        int num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < floor; j++) {
                triangle[i][j] = answer[num];
                num++;
            }
            floor++;
        }
        return answer;
    }

    public int[][] down (int[][] arr, int n) {
        int snail = x;
        for (int i = snail; i < n; i++) {
            if (arr[x][y] != 0) {
                break;
            } else {
                arr[x][y] = cnt;
                cnt++;
                if (x != n -1) {
                    x++;
                }
            }
        }
        
        return arr;
    }
    
    public int[][] straight (int[][] arr, int n) {
        int snail = y;
        for (int i = snail; i < n; i++) {
            if (arr[x][y] != 0) {
                break;
            } else {
                arr[x][y] = cnt;
                cnt++;
                if (y != n - 1) {
                    y++;
                }
            }
        }
        return arr;
    }
    
    public int[][] up (int[][] arr, int n) {
        
        
        while(true) {
            if (x == 0 || y == 0 || arr[x - 1][y - 1] != 0) {
                break;
            }

            if(x != 0 && y != 0) {
                x--;
                y--;
            }
            
            arr[x][y] = cnt;
            cnt++;
        }
        
        return arr;
    }
}
