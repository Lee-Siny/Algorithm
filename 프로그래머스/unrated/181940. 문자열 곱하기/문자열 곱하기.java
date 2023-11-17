// class Solution {
//     public String solution(String my_string, int k) {
//         String answer = "";
        
//         for(int i = 0; i < k; i++){
//             answer += my_string;
//         } // for
        
//         return answer;
//     } // main
// } // class


// class Solution {
//     public String solution(String my_string, int k) {     
//         StringBuilder sb = new StringBuilder();
        
//         for(int i = 0; i < k; i++){
//             sb.append(my_string);
//         } // for
        
//         return sb.toString();
//     } // main
// } // class


class Solution {
    public String solution(String my_string, int k) {
        return my_string.repeat(k);
    } // main
} // class