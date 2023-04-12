// n개의 음이 아닌 정수들이 있습니다. 이 정수들을 순서를 바꾸지 않고 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 
// 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.

// -1+1+1+1+1 = 3
// +1-1+1+1+1 = 3
// +1+1-1+1+1 = 3
// +1+1+1-1+1 = 3
// +1+1+1+1-1 = 3
// 사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 
// 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.

// 제한사항

// 주어지는 숫자의 개수는 2개 이상 20개 이하입니다.
// 각 숫자는 1 이상 50 이하인 자연수입니다.
// 타겟 넘버는 1 이상 1000 이하인 자연수입니다.

class Solution {
	// 1. 답 변수 answer static으로 선언.
    static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        
    	// 2. dfs 함수 실행.
        dfs(numbers, target, 0, 0);
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int idx, int sum){
        
    	// 3. 배열 마지막 노드까지 탐색이 끝났는지 체크
        if (idx == numbers.length) {
        	// 4. 합계와 타겟 값이 같으면 answer을 1 증가 시킴.
            if(sum == target) {
                answer++; 
            }
        } else {
        	// 5. 해당 노드 값을 더하고 다음 값 탐색
            dfs(numbers, target, idx + 1, sum + numbers[idx]);
            
            // 6. 해당 노드 값을 빼고 다음 값 탐색
            dfs(numbers, target, idx + 1, sum - numbers[idx]);
        }   
    }
}
