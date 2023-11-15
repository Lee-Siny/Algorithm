import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        // System.out.println(a+b);
        
        // System.out.println(a.concat(b));
        
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(b);
        System.out.println(sb);
        
    } // main
} // class