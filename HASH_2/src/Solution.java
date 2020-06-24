//전화번호부
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        List<String> list = new ArrayList<String>();
        
        for(int i = 0; i < phone_book.length; i++){
            list.add(phone_book[i]);
        }
        
        Collections.sort(list);
        
        for(int i = 0; i < list.size(); i++){
            String s1 = list.get(i);
            
            for(int j = i + 1; j < list.size(); j++){
                String s2 = list.get(j);
                
                if(s2.contains(s1)){
                    return false;
                }
            }
        }
        
        return true;
    }
}