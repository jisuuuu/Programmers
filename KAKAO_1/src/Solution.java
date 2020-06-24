//크레인 인형뽑기 게임
import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int m = 0; m < moves.length; m++){
            for(int i = 0; i < board.length; i++){
                if(board[i][moves[m] - 1] != 0){
                    if(!stack.isEmpty()){
                        if(stack.peek() == board[i][moves[m] - 1]){
                            answer += 2;
                            stack.pop();
                            board[i][moves[m] - 1] = 0;
                            break;
                        }
                    }
                    stack.push(board[i][moves[m] - 1]);
                    board[i][moves[m] - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}