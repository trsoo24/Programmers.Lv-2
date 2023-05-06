// https://school.programmers.co.kr/learn/courses/30/lessons/12985

// 대진표에서 A, B 가 서로를 만나기 전까지 다 이긴다는 가정 하에 둘이 만나는 경기가 몇번째인지 푸는 문제.
// 의외로 손코딩으로 쉽게 풀었다. A번째 참가자와 B번째 참가자가 같은 번호가 될때까지 X /= 2 해서 같은 번호가 되면 서로의 대결 순서가 된다. 

class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;
        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
        }
     
        return answer;
    }
}
