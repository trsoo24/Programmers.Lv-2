// 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 
// 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

class Solution {
    public int solution(int n) {
        int answer = 0;
        String numb = Integer.toString(n, 3); // 10진수 -> 3진수 Integer.toString(10진수, 3)
        String reverse = new StringBuilder(numb).reverse().toString(); // 3진수로 바뀐 문자열을 뒤집기 reverse()
        
        answer = Integer.valueOf(reverse, 3); // (3진수 문자열 -> 10진수 Integer 로 바꾸기 Integer.valueOf(3진수 문자열, 3)
        return answer;
    }
}
