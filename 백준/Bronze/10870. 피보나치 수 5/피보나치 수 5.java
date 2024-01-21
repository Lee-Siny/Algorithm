import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(fibonacci(n));

    } //main

    static int fibonacci(int n) {
        if (n == 0)	return 0;
        if (n == 1)	return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    } //fibonacci()

} //class


//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//
//        int[] fibonacci = new int[n + 1];
//
//        for(int i = 0; i < fibonacci.length; i++) {
//            if(i == 0) fibonacci[0] = 0;
//            else if(i == 1) fibonacci[1] = 1;
//            else fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
//        } //for
//
//        System.out.println(fibonacci[n]);
//
//    } //main
//} //class