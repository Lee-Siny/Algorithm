// class Solution {
//     public int solution(int a, int b) {        
//         String ab = String.valueOf(a) + String.valueOf(b);
//         String ba = String.valueOf(b) + String.valueOf(a);
        
//         int abValue = Integer.parseInt(ab);
//         int baValue = Integer.parseInt(ba);
        
//         if (abValue >= baValue) {
//             return abValue;
//         } else {
//             return baValue;
//         } // if=else
//     } // main
// } // class


// class Solution {
//     public int solution(int a, int b) {
//         int ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
//         int ba = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
//         return ab >= ba ? ab : ba;
//     } // main
// } // class


class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int aLong = Integer.parseInt(""+a+b);
        int bLong = Integer.parseInt(""+b+a);
        answer = aLong > bLong ? aLong : bLong;

        return answer;
    } // main
} // class