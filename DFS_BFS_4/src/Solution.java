//N으로 표현
class Solution {
    static int answer = -1;
    public int solution(int n, int number) {
        dfs(0, 0, n, number);
        
        return answer;
    }
    public void dfs(int cnt, int prev, int n, int number){
        int temp = n;
        
        if(cnt > 8){
            answer = -1;
            return;
        }
        
        if(number == prev){
            if(answer == -1 || answer > cnt){
                answer = cnt;
            }
            return;
        }
        
        for(int i = 1; i < 8 - cnt + 1; i++){
            dfs(cnt + i, prev + temp, n, number);
            dfs(cnt + i, prev - temp, n, number);
            
            if(prev != 0){
                dfs(cnt + i, prev * temp, n, number);
                dfs(cnt + i, prev / temp, n, number);
            }
            
            temp = temp * 10 + n;
        }
    }
}
