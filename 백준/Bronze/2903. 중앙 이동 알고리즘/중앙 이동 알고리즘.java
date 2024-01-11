import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 한 변의 점의 개수 2 -> 3 -> 5 -> 9 -> 17 -> ... => (2^n + 1)
        int dot = (int) Math.pow(2, n) + 1;

        // 총 점의 개수 (2^n + 1)^2
        System.out.println((int) Math.pow(dot, 2));

        br.close();
    } //main
} //class

