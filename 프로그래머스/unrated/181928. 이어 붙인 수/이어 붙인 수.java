// class Solution {
//     public int solution(int[] num_list) {     
//         StringBuilder sbEven = new StringBuilder();
//         StringBuilder sbOdd = new StringBuilder();

//         for(int i =0; i < num_list.length; i++){
//             if(num_list[i]%2 == 0){
//                 sbEven.append(num_list[i]);
//             } else{
//                 sbOdd.append(num_list[i]);
//             } //if-else
//         } //for
        
//         int even = Integer.parseInt(sbEven.toString());
//         int odd = Integer.parseInt(sbOdd.toString());
        
//         return even + odd;
//     } //main
// } //class


class Solution {
    public int solution(int[] num_list) {     
        StringBuilder sbEven = new StringBuilder();
        StringBuilder sbOdd = new StringBuilder();

        for(int i : num_list){
            if( i % 2 == 0){
                sbEven.append(i);
            } else{
                sbOdd.append(i);
            } //if-else
        } //for
        
        int even = Integer.parseInt(sbEven.toString());
        int odd = Integer.parseInt(sbOdd.toString());
        
        return even + odd;
    } //main
} //class