// https://school.programmers.co.kr/learn/courses/30/lessons/12980


// 그냥 생각하는 문제인가..?
import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                ans += 1;
            }
            n /= 2;
        }
        return ans;
    }
}
