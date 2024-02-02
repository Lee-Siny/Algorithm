import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 거슬러 줄 수 없을때를 Default로함
        int result = -1;

        for(int i = n / 5; i >= 0; i--){

            // 5원이 i개 일때 나머지 금액을 2원으로 줄 수 있을때
            if((n - (5 * i)) % 2 == 0) {
                result = i + (n - (5 * i)) / 2;

                // 최소개수를 반환해야 함 => 가장 먼저 if조건을 true로 만족시키는 결과 반환
                break;
            } //if
        } //for

        System.out.println(result);
    } //main
} //class