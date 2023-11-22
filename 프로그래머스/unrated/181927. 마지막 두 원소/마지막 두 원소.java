// class Solution {
//     public int[] solution(int[] num_list) {   
//         int arrL = num_list.length;
//         int cal = 0;
        
//         if(num_list[arrL-1] > num_list[arrL-2]){
//             cal = num_list[arrL-1] - num_list[arrL-2];
//         } else{
//             cal = num_list[arrL-1] * 2;
//         } //if-else
        
//         int[] answer = new int[arrL+1];;
        
//         for (int i = 0; i < arrL; i++) {
//             answer[i] = num_list[i];
//         } //for
        
//         answer[arrL] = cal;
        
//         return answer;
//     } //main
// } //class


class Solution {
    public int[] solution(int[] num_list) {
        int arrL = num_list.length;
        
        int[] answer = new int[arrL+1];

        for(int i = 0; i < arrL; i++){
            answer[i] = num_list[i];
        } //for

        answer[arrL] = num_list[arrL-1] > num_list[arrL-2] ? num_list[arrL-1]-num_list[arrL-2]:num_list[arrL-1]*2;
        
        return answer;
    } //main
} //class

