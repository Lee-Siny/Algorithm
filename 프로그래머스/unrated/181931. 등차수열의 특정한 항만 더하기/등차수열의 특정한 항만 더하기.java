class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        for(int i = 0; i < included.length; i++){
            boolean tf = included[i];
            
            if(tf){
                answer += a + (d * i);                
            } else{
                continue;
            } // if-else
            
        } // for
        
        return answer;
    } //main
} //class