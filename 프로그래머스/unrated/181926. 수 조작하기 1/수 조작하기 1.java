// class Solution {
//     public int solution(int n, String control) {
//         for(char c : control.toCharArray()){
//             if(c == 'w'){
//                 n += 1;
//             } else if(c == 's') {
//                 n -= 1;
//             } else if(c == 'd') {
//                 n += 10;
//             } else if(c == 'a') {
//                 n -= 10;
//             } // else-if
//         } // for
        
//         return n;
//     } //main
// } //class


// class Solution {
//     public int solution(int n, String control) {
//         int answer = n;

//         for(char c : control.toCharArray()) {
//             switch(c) {
//                 case 'w': answer += 1; break;
//                 case 's': answer -= 1; break;
//                 case 'd': answer += 10; break;
//                 case 'a': answer -= 10; break;
//                 default:break;
//             } //switch
//         } //for
//         return answer;
//     } //main
// } //class


class Solution {
    public int solution(int n, String control) {
        for(char c : control.toCharArray()){
            n += c == 'w' ? 1 : c == 's' ? -1 : c == 'd' ? 10 : -10;
        } //for
        return n;
    } //main
} //class