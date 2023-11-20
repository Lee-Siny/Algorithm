class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if(a == b && a == c){ // 세 숫자 모두 같을때
            answer = (a + b + c) 
                    * (int)((Math.pow(a,2)) + (Math.pow(b,2)) + (Math.pow(c,2)))
                    * (int)((Math.pow(a,3)) + (Math.pow(b,3)) + (Math.pow(c,3)));
            
        } else if(a != b && a != c && b != c){ // 세 숫자 모두 다를때
            answer = (a + b + c);
            
        } else{ // 그 외 (두 숫자는 같고 나머지 한 숫자는 다를때)
            answer = (a + b + c) 
                    * (int)((Math.pow(a,2)) + (Math.pow(b,2)) + (Math.pow(c,2)));
        } // if-else
        
        return answer;
    } //main
} //class