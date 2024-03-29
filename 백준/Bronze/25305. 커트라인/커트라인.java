import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[n];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        } //for

        // 내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[k - 1]);

//        // 오름차순 정렬
//        Arrays.sort(arr);
//        System.out.println(arr[n - k]);
    } //main
} //class