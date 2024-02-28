import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        } //for

        Arrays.sort(arr);

        int result = 0;
        int sum = arr[0];
        for(int i = 1; i < n ; i++) {
            sum += arr[i];
            arr[i] = sum;
        } //for

        for(int i : arr) {
            result += i;
        } //for

        System.out.println(result);

        br.close();
    } //main
} //class

