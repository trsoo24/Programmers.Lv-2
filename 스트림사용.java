// 마을에 1부터 N 의 고유번호를 가진 사람들이 있다. 소문으로는 마을 사람 중에 마을 판사가 있다고한다.
// 마을판사가 실제로 존재한다면 1. 마을판사는 아무도 믿지 않는다.
// 2. 다른 모든 사람들은 마을 판사를 믿는다. 3. 마을 판사가 있다면 오직 한명 뿐이다.
// 2차원 배열 trust 가 주어졌을때, trust[i] = {a, b} 는 고유 번호가 a인 사람이 고유 번호가 b 인 사람을 믿는다는 뜻이다.
//  마을 판사가 존재한다면 마을 판사의 고유 번호를, 아니라면 -1 을 출력하는 프로그램을 작성하시오
// (단 a 가 b 를 믿고 b가 c 를 믿는다고 할때, a가 c 를 믿는다는 의미는 아니다)
// 2 < N <= 10000 / 0 <= trust.length <= 10000

import java.util.Arrays;

class Solution8 {
    public int solution (int N, int[][] trust) {
        // 스트림 사용엔 length 가 0 인 예외상황은 미리 처리해주어야 에러가 안남
        if (trust.length == 0) {
            return -1;
        }

        for (int i = 1; i <= N; i++) {
            int finalI = i;
            // 마을 판사가 아무도 믿지 않는다는 뜻 (noneMatch = 하나도 성립하지 않아야 true)
            if (Arrays.stream(trust).noneMatch(x -> x[0] == finalI) &&
                    Arrays.stream(trust).filter(x -> x[1] == finalI).count() == (N -1))  {
                    // 위의 조건 + 선택받은 횟수가 (N -1)개인 고유 번호는 판사다.
                return finalI;
            }
        }
        return -1;
    }
}

public class Week3_01 {
    public static void main(String[] args) {
        int N = 3;
        int[][] trust = {{1, 3}, {2, 3}};
        System.out.println(new Solution8().solution(N, trust));
    }
}

