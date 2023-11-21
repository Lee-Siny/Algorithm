// class Solution {
//     public int solution(int[] num_list) {
//         int sum = 0;
//         int mult = 1;
        
//         for(int i = 0; i < num_list.length; i++){
//             sum += num_list[i];
//             mult *= num_list[i];            
//         } //for
        
//         if(mult < Math.pow(sum, 2)){
//             return 1;
//         } else{
//             return 0;
//         } //if-else
//     } //main
// } //class


class Solution {
    public int solution(int[] num_list) {
        int sum  = 0;
        int mult = 1;

        for(int i : num_list) {
            sum += i;
            mult *= i;
        } //for

        return Math.pow(sum,2) > mult ? 1 : 0;
    } // main
} //class