//숫자 야구
import java.util.*;

class Solution {
    public boolean guess(int[] base, String num){
        String guess_n = String.valueOf(base[0]);
        int guess_s = base[1];
        int guess_b = base[2];
        int strike = 0;
        int ball = 0;
        List<Character> tmp = new ArrayList<>();
        
    	for(int i = 0; i < 3; i++) {
    		tmp.add(num.charAt(i));
    	}
        
        for(int i=0; i < 3; i++) {
    		if(guess_n.charAt(i) == num.charAt(i)) {
    			strike++;
                continue;
    		}
            if(tmp.contains(guess_n.charAt(i))) {
    			ball++;
    		}
    	}
        
        if(strike == guess_s && ball == guess_b){
            return true;
        }
        else{
            return false;
        }
    }
    public int solution(int[][] baseball) {
        int answer = 0;
        List<String> list = new ArrayList<String>();
        for(int i = 1; i <= 9; i++) {
        	for(int j = 1; j <= 9; j++) {
        		for(int k = 1; k <= 9; k++) {
        			if(i != j && j != k && i != k) {
        				list.add(String.valueOf(i * 100 + j * 10 + k));
        			}
        		}
        	}
        }
        
        for(int i = 0; i < list.size(); i++){
            int flag = 0;
            for(int j = 0; j < baseball.length; j++){
                if(guess(baseball[j], list.get(i)) == false){
                    flag = 1;
                }
            }
            if(flag == 0){
                answer++;
            }
        }
        return answer;
    }
}