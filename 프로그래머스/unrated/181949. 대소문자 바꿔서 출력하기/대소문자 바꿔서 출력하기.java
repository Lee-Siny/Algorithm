import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String answer = "";
        for (char c : a.toCharArray()) {
            if (c == Character.toLowerCase(c)) {
                answer = answer + Character.toUpperCase(c); 
            }else {
                answer = answer + Character.toLowerCase(c);
            } // if-else
        } // for

        System.out.println(answer);
    } // main
} // class