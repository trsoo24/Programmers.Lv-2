// 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() != 4 && s.length() != 6) {
            answer = false;
        }
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.getNumericValue(c) < 0
                    || Character.getNumericValue(c) > 9) {
                answer = false;
            }
        }
        return answer;
    }
}
