//완주하지 못한 선수
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        List<String> p = new ArrayList<String>();
        List<String> c = new ArrayList<String>();
        
        for(int i = 0; i < participant.length; i++){
            p.add(participant[i]);
        }
        for(int i = 0; i < completion.length; i++){
            c.add(completion[i]);
        }
        
        Collections.sort(p);
        Collections.sort(c);
        
        String answer = "";
        for(int i = 0; i < c.size(); i++){
            String p_1 = p.get(i);
            String c_1 = c.get(i);
            if(!p_1.equals(c_1)){
                answer = p.get(i);
                break;
            }
        }
        if(answer.equals("")){
            answer = p.get(p.size() - 1);
        }
    
        return answer;
    }
}