
public class Solution {
	static int answer;
	
	public void dfs(int[] numbers, int target, int idx){
        if(idx == numbers.length){
            int sum = 0;
            
            for(int i = 0; i < numbers.length; i++){
                sum += numbers[i];
            }
            
            if(sum == target)
                answer++;
            return;
        }
        else{
            numbers[idx] *= 1;
            dfs(numbers, target, idx + 1);
            
            numbers[idx] *= -1;
            dfs(numbers, target, idx + 1);
        }
	}
	
	public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0);
        return answer;
    }
}
