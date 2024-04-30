// 어느 공원 놀이터에는 시소가 하나 설치되어 있습니다. 이 시소는 중심으로부터 2(m), 3(m), 4(m) 거리의 지점에 좌석이 하나씩 있습니다.
// 이 시소를 두 명이 마주 보고 탄다고 할 때, 시소가 평형인 상태에서 각각에 의해 시소에 걸리는 토크의 크기가 서로 상쇄되어 완전한 균형을 
// 이룰 수 있다면 그 두 사람을 시소 짝꿍이라고 합니다. 즉, 탑승한 사람의 무게와 시소 축과 좌석 간의 거리의 곱이 양쪽 다 같다면 시소 짝꿍이라고 할 수 있습니다.
// 사람들의 몸무게 목록 weights이 주어질 때, 시소 짝꿍이 몇 쌍 존재하는지 구하여 return 하도록 solution 함수를 완성해주세요.


// 첫 풀이 : 시간 복잡도 O(N^2)
class Solution1 {
    public long solution(int[] weights) {
        long answer = 0;
        
        for (int i = 0; i < weights.length - 1; i++) {
            for (int j = i + 1; j < weights.length; j++) {
                if (verify(weights[i], weights[j])) {
                    answer++;
                }
            }
        }
        return answer;
    }
    
    boolean verify(int weight1, int weight2) {
        for (int i = 2; i < 5; i++) {
            int newWeight1 = weight1 * i;
            for (int j = 2; j < 5; j++) {
                int newWeight2 = weight2 * j;
                if (newWeight1 == newWeight2) {
                    return true;
                }
            }
        }
        return false;
    }
}

// 시간 복잡도 개선
class Solution2 {
}
