class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if(ineq.equals(">") && eq.equals("=")) {
            return n >= m ? 1 : 0;
        } // if
        
        if(ineq.equals("<") && eq.equals("=")) {
            return n<=m ? 1 : 0;
        } // if
        
        if(ineq.equals(">") && eq.equals("!")) {
            return n>m ? 1 : 0;
        } // if
        
        return n<m ? 1 : 0;
        
    } // main
} // class