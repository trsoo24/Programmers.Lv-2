// https://school.programmers.co.kr/learn/courses/30/lessons/17681#

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] arr = new String[n];
        for(int i = 0; i < arr1.length; i++) {
            arr[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            arr[i] = "0".repeat(n - arr[i].length()) + arr[i]; // 비어있는 앞 자리에 0을 표기하기 위해 "0"을 넣어서 값 입력
        }
        for(int j = 0; j < arr.length; j++) {
            answer[j] = arr[j].replaceAll("1", "#").replaceAll("0", " ");
        }
        return answer;
    }
}
