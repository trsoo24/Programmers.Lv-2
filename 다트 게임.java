// https://school.programmers.co.kr/learn/courses/30/lessons/17682

// 알고리즘보단 노력으로 푸는 문제..?

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        String[] arr = dartResult.split("");
        int[] score = new int[3];
        int idx = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].matches("[0-9]")) {
                idx++;
                score[idx] = Integer.parseInt(arr[i]);
                if (arr[i + 1].matches("[0-9]")) {
                    score[idx] = Integer.parseInt(arr[i + 1]) + score[idx] * 10;
                    i++;
                }
            }
            switch(arr[i]) {
                case "D" :
                    score[idx] *= score[idx];
                    break;
                case "T" :
                    score[idx] *= score[idx] * score[idx];
                    break;
                case "*" :
                    score[idx] *= 2;
                    if(idx - 1 >= 0) {
                        score[idx - 1] *= 2;
                    }
                    break;
                case "#" :
                    score[idx] *= -1;
                    break;
            }
        }
        
        for (int x : score) {
            answer += x;
        }
        
        return answer;
    }
}
