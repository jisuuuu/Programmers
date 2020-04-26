//단어변환
class Solution {
	
    static int min = 0;
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean[] visited = new boolean[words.length];
        
        for(int i = words.length - 1; i >= 0; i--){
            if(compare(target, words[i]) == 0){
                dfs(begin, words, visited, i, 1);
            }
        }
        
        answer = min;
        return answer;
    }
    public int compare(String s1, String s2){
        int cnt = 0;
        
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i))
                cnt++;
        }
        return cnt;
    }
    public void dfs(String now, String[] words, boolean[] visited, int idx, int depth){
        if(compare(now, words[idx]) == 1){
            if(min == 0)
                min = depth;
            else
                min = Math.min(min, depth + 1);
        }
        visited[idx] = true;
        for(int i = 0; i < words.length; i++){
            if(compare(words[idx], words[i]) == 1 && visited[i] == false){
                dfs(now, words, visited, i, depth + 1);
            }
        }
    }
}
