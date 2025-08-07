import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());
        String[] sNumArr = br.readLine().split("");

        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += Integer.parseInt(sNumArr[i]);
        }
        System.out.println(sum);
    }
}