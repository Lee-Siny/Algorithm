import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];

        for(int  i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        } //for

        Arrays.sort(arr, Comparator.reverseOrder());

        long ans = 0;
        for (int i = 0; i < n; i++) {
            // 팁 0원 = 반복문 종료
            if (arr[i] - i <= 0) {
                break;
            } //if

            ans += arr[i] - i;
        } //for

        System.out.println(ans);
    } //main
} //class

