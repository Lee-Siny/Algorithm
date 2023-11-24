class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for(int i = 0; i < numLog.length-1 ; i++){
            int num = numLog[i + 1] - numLog[i];
            
            answer += num == 1 ? "w" : num == -1 ? "s" : num == 10 ? "d" : "a";
        } //for
        
        return answer;
    } //main
} //class