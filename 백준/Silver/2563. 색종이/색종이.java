import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[][] arr = new boolean[101][101];    // 도화지
        int confetti = Integer.parseInt(br.readLine());   // 색종이 개수
        int area = 0;   // 검은 영역의 넓이

        // 색종이 개수 만큼 진행
        for(int i = 0; i < confetti; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j = x; j < x + 10; j++){
                for(int k = y; k < y + 10; k++){
                    if (!arr[j][k]) {   // 중복 영역 제거
                        arr[j][k] = true;
                        area++;
                    } //if
                } //for
            } //for
        } //for

        System.out.println(area);

        br.close();
    } //main
} //class

