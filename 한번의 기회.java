// 숫자 num이 주어졌을 때, 최대 한번의 자릿수 교환을 통해 최대의 숫자를 만들어 내려고 한다.
// 즉, 자릿수를 교환하지 않았을 때가 더 큰 숫자인 경우, 원래 숫자를 그대로 출력해야 한다.
//      입력설명
// 10 <= num <= 1000000

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(43824));
    }
    private int solution(int num) {
        String number = String.valueOf(num);
        String[] arr = number.split("");
        int value = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(value < Integer.parseInt(arr[i])) {
                value = Integer.parseInt(arr[i]);
                index = i;
            }
        }
        String temp = "";
        for (int j = 0; j < arr.length; j++) {
            if (Integer.parseInt(arr[j]) != value) {
                temp = arr[j];
                arr[j] = arr[index];
                arr[index] = temp;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String idx : arr) {
            sb.append(idx);
        }
        return Integer.parseInt(sb.toString());
    }
}
