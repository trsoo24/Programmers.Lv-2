// 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
//   단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if (arr.length == 1 || arr.length == 0) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        } 
        int a = arr[0];
        int num = 0;
        answer = new int[arr.length - 1];
        for(int i = 1; i < arr.length; i++) {
            if(a > arr[i]) {
                a = arr[i];
            }
        }
        for(int j = 0; j < arr.length; j++) {
            if(arr[j] != a) {
                answer[num] = arr[j];
                num++;
            }
        }
        return answer;
    }
}
