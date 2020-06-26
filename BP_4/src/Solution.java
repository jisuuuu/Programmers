//Ä«Æê
import java.util.*;

class Solution {
    class New{
        int x;
        int y;
        public New(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        List<New> list = new ArrayList<New>();
        
        int total = brown + yellow;
        for(int i = 1; i <= Math.sqrt(total); i++){
            if(total % i == 0){
                list.add(new New(total / i, i));
            }
        }
        
        for(int i = 0 ; i < list.size(); i++){
            New n = list.get(i);
            
            if(n.y == 1){
                continue;
            }
            
            if((n.x - 2) * (n.y - 2) == yellow){
                answer = new int[2];
                
                answer[0] = n.x;
                answer[1] = n.y;
                
                return answer;
            }
        }
        
        return answer;
    }
}