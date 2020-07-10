//정수 내림차순으로 배치하기
import java.util.*;

class Solution {
    public long solution(long n) {
        String answer = "";
        String str = String.valueOf(n);
        List<Character> list = new ArrayList<Character>();
        
        for(int i = 0; i < str.length(); i++){
            list.add(str.charAt(i));
        }
        Collections.sort(list);
        Collections.reverse(list);
        
        for(int i = 0; i < list.size(); i++){
            answer += list.get(i);
        }
        return  Long.parseLong(answer);
    }
}