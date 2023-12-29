import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        // 별 증가 횟수 => 5번
        for(int i = 1; i <= n; i++){

            // (n - i) 만큼 공백을 앞에 넣음
            for(int j = 1; j <= (n - i); j++){
                sb.append(" ");
            } //for(공백)

            // (i * 2 -  1) 만큼 *을 넣음
            for(int k = 1; k <= (i * 2 - 1); k++){
                sb.append("*");
            } //for(별)

            // 줄 바꿈
            sb.append("\n");
        } //for

        // 별 감소 횟수 => 4번
        for(int i = 1; i <= (n - 1); i++ ){

            // i 만큼 공백을 넣음
            for(int j = 1; j <= i; j++){
                sb.append(" ");
            } //for(공백)

            // ((n - i) * 2 - 1) 만큼 *을 넣음
            for(int k = 1 ; k <= ((n - i) * 2 - 1); k++){
                sb.append("*");
            } //for(별)

            sb.append("\n");
        } //for

        System.out.println(sb);

        br.close();
    } //main
} //class

