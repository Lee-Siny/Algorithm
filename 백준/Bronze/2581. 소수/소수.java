import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int min = n;
        int sum = 0;

        for(int i = m; i <= n; i++) {
            boolean isPrime = true;   // 소수 판별 변수

            // 1은 소수 X
            if(i == 1) isPrime = false;

            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                } //if
            } //for

            if(isPrime) {
                if(min > i) min = i;
                sum += i;
            } //if
        } //for

        if(sum == 0) {
            System.out.println(-1);
        }else {
            System.out.println(sum + "\n" + min);
        } //if-else

    } //main
} //class