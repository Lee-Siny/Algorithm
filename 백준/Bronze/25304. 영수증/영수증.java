import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1 ; i <= n ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            sum += (a * b);
        } //for

        System.out.println(total == sum ? "Yes" : "No");
        
        sc.close();
    } //main
} //class