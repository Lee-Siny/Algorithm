class Solution {
    public int solution(int number, int n, int m) {
        
//         if(number%n==0){
            
//             if(number%m==0){
//                 return 1;
//             } else {
//             return 0;    
//             } // if-else
            
//         } else {
//             return 0;    
//         }  // if-else
        
        return number % n == 0 && number % m == 0 ? 1 : 0;
    } // main
} // class