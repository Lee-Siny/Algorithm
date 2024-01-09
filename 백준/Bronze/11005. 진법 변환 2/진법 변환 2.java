import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        while(n != 0){
            // 나머지가 10 이상 10진수 이상의 수
            // 아스키코드 연산 필요 (ex) A => (10) + 65 - 10 = 65)
            if(n % b >= 10){
                sb.append((char)((n % b) + 'A' - 10));
            } else{ // 나머지가 1자리수 => 그대로 append
                sb.append(n % b);
            } //if-else

            // b로 나눈 몫을 다시 계산
            n /= b;
        } //while

        System.out.print(sb.reverse().toString());

        br.close();
    } //main
} //class

