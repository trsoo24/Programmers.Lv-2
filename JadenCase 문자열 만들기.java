// JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 
//   단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. 
// 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
//          s	                     return
// "3people unFollowed me"	"3people Unfollowed Me"
// "for the last week"    	"For The Last Week"

class Solution {
    public String solution(String s) {
        char[] ch = s.toCharArray();

        for(int i = 0 ; i < s.length() ; i++){
            if(ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] -= 'A'-'a'; 
            }
            if(i == 0 && ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] += 'A'-'a';
            } 
            if(i != 0 && ch[i-1] == ' ' && ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] += 'A'-'a';
            }
        }
        String answer = new String(ch);
        return answer;
    }
}
