class Solution {
    public String solution(String str1, String str2) {
        // String answer = "";
        
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < str1.length(); i++){
            // 문자+문자 는 숫자연산(아스키코드)
            // answer += String.valueOf(str1.charAt(i)) + str2.charAt(i);
            
            sb.append(str1.charAt(i)).append(str2.charAt(i));
        } // for
        
        // return answer;
        
        // return sb.toString();
        return String.valueOf(sb);
    } // main
} // class