import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 == 0){
            // System.out.println(n + " is even");
            System.out.printf("%d is even",n);
        }else{
            // System.out.println(n + " is odd");
            System.out.printf("%d is odd", n);
        } // if-else
        
        // System.out.print(n + " is "+(n % 2 == 0 ? "even" : "odd"));
        
    } // main
} // class