// 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

// 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
// (1은 소수가 아닙니다.)

// 제한 조건
// n은 2이상 1000000이하의 자연수입니다.

// 제한 조건에 수가 굉장히 크기 때문에 하나하나 찾아보기엔 효율성 점수를 얻지 못했다.
// 수학적인 접근이지만, 소수는 약수가 1, n 만 존재하기에 어떤 수의 배수는 모두 소수가 아니라는 방식을 이용해서
// 계산 시간을 줄여 효율성 제한 시간을 통과했다.

class Solution {   
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i; // 모든 값 해당 위치 배열에 저장
        }
        
        for (int j = 2; j <= Math.sqrt(n); j++) {
            // 제곱근과 보다 낮은 수들의 배수를 모두 0으로 바꾼다.
            for (int k = j + j; k <= n; k += j) {
                arr[k] = 0;
            }
        }
        
        
        for (int x = 2; x < arr.length; x++) {
            if (arr[x] != 0) {
                // 0이 되지 않은 수들은 소수
                answer++;
            }
        }
        
        return answer;
    }
}
