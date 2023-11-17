class Solution {
    public String solution(String[] arr) {
        String answer = "";
        
        // for (int i = 0; i < arr.length; i++) {
        //     answer += arr[i];
        // } // for

        for(String a : arr) {
            answer += a;
        } // for
        
        return answer;
    } // main
} // class


// class Solution {
//     public String solution(String[] arr) {
        
//         return String.join("", arr);
        
//     } // main
// } // class


// class Solution {
//     public String solution(String[] arr) {
//         StringBuilder sb = new StringBuilder();
//         for (String s: arr) {
//             sb.append(s);
//         }
//         return sb.toString();
//     }
// }