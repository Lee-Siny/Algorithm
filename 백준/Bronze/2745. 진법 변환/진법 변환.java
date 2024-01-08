import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int result = 0;

        for (int i = n.length() - 1 ; i >= 0; i--) {
            char c = n.charAt(i);
            int temp;   // 각 자리의 10진수 숫자

            // ZZZZZ (36진수) => 36 진수에서 Z => 35번째 수
            // ZZZZZ 뒤에부터 인덱스 0시작 앞자리로 가면서 +1
            // 5번째 = 35 x 36^0, 4번째 35 x 36^1, 3번째 35 x 36^2, ...
            // 즉, 각 자리의 10진수 숫자 * 진수의 각 자리수 제곱 => 을 모두 더하면 10진수로 변환한 값
            if ('A' <= c && c <= 'Z') { // 단어가 알파벳인 경우
                temp = (int)c - 'A' + 10; // 그 알파벳을 해당하는 수로 바꿔준다 ('A' = 10)
            } else { // 단어가 알파벳이 아닌 경우 => 숫자인 경우
                temp = c - '0'; // char로 되어있는 그 수를 int로 바꿔준다
            } //if-else

            // 자릿수 만큼 b의 거듭제곱으로 곱함
            temp *= (int) Math.pow(b, n.length() - i - 1);

            // 반환할 값에 더함 (각 자리수 10진수 숫자 * 진수의 각 자리수 제곱을 모두 더한게 10진수로 변환한 값 결과)
            result += temp;
        } //for

        System.out.print(result);

        br.close();
    } //main
} //class

