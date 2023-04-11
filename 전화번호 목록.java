// 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
// 전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

// 구조대 : 119
// 박준영 : 97 674 223
// 지영석 : 11 9552 4421
// 전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때,
// 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.

// 제한 사항
// phone_book의 길이는 1 이상 1,000,000 이하입니다. <= 전체 phone_book 배열 2중 for 문 사용하지 말라는 뜻 !!
// 각 전화번호의 길이는 1 이상 20 이하입니다.
// 같은 전화번호가 중복해서 들어있지 않습니다.

import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for (int i = 0; i < phone_book.length; i++) { // map 에 key 로 구분하기 위해서 담음
            map.put(phone_book[i], i);
        }
        
        for (int j = 0; j < phone_book.length; j++) {
            for (int k = 1; k < phone_book[j].length(); k++) {
                if (map.containsKey(phone_book[j].substring(0, k))) { // 해당 Key 값을 포함하고 있는 Key 가 있는지 확인
                    answer = false;
                }
            }
        }
        
        return answer;
    }
}
