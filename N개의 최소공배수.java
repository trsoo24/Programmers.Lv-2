// 두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다. 
// 예를 들어 2와 7의 최소공배수는 14가 됩니다. 
// 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다. 
// n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.

class Solution {
    public int gcd (int a, int b) { // 최대 공약수
        if (a < b) { // a가 항상 b보다 큰 수일 수 있도록 바꿔줌
            int tmp = a;
            a = b;
            b = tmp;
        }
        
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public int lcm (int a, int b) { // 최소 공배수
        return a * b / gcd(a, b);
    }
    
    public int solution(int[] arr) { // 유클리드 호제법
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) { // arr 만큼 반복
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }
}
