import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        st = new StringTokenizer(br.readLine(), " ");

        while(st.hasMoreTokens()) {

            // 소수O = true, 소수X = false
            boolean isPrime = true;

            int num = Integer.parseInt(st.nextToken());

            if(num == 1) {
                continue;
            } //if

            // 소수 판별
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                } //if
            } //for

            // 소수 카운팅
            if(isPrime) {
                count++;
            } //if
        } //while

        System.out.println(count);
    } //main
} //class