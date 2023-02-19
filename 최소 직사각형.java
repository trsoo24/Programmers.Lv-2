// 명함 번호	가로 길이	세로 길이
// 1	60	50
// 2	30	70
// 3	60	30
// 4	80	40
// 가장 긴 가로 길이와 세로 길이가 각각 80, 70이기 때문에 80(가로) x 70(세로) 크기의 지갑을 만들면 모든 명함들을 수납할 수 있습니다.
// 하지만 2번 명함을 가로로 눕혀 수납한다면 80(가로) x 50(세로) 크기의 지갑으로 모든 명함들을 수납할 수 있습니다. 이때의 지갑 크기는 4000(=80 x 50)입니다.

// 모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다. 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때,
// 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.

//   각 배열에서 큰 값은 1번에, 작은 값은 0번에 위치할 수 있도록 배열을 재배치하고,
//   두 위치에서 가장 큰 값만 찾아서 곱해주었다.

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[][] size = new int[sizes.length][2];
        
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                size[i][0] = sizes[i][1];
                size[i][1] = sizes[i][0];
            } else {
                size[i][0] = sizes[i][0];
                size[i][1] = sizes[i][1];
            }
        }
        
        int a = 0;
        int b = 0;
        
        for (int j = 0; j < size.length; j++) {
            a = Math.max(size[j][0], a);
            b = Math.max(size[j][1], b);
        }
        answer = a * b;
        return answer;
    }
}
