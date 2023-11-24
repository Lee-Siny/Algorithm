// class Solution {
//     public String solution(int[] numLog) {
//         String answer = "";
        
//         for(int i = 0; i < numLog.length-1 ; i++){
//             int num = numLog[i + 1] - numLog[i];
            
//             answer += num == 1 ? "w" : num == -1 ? "s" : num == 10 ? "d" : "a";
//         } //for
        
//         return answer;
//     } //main
// } //class


class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i=1; i<numLog.length; i++){
            int num = numLog[i-1] - numLog[i];
            switch(num){
                case -1 : answer+='w'; break;
                case 1 : answer+='s'; break;
                case -10 : answer+='d'; break;
                case 10 : answer+='a'; break;
            } //switch
        } //for
        return answer;
    } //main
} //class