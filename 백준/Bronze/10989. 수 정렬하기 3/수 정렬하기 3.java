//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int n = Integer.parseInt(br.readLine());
//
//        // List는 메모리를 많이 사용
//        int[] arr = new int[n];
//
//        for(int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        } //for
//
//        Arrays.sort(arr);
//
//        for(int result : arr) {
//            sb.append(result).append("\n");
//        } //for
//
//        System.out.println(sb);
//    } //main
//} //class


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 카운팅 정렬 사용
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 0 ~ 10000
        int[] arr = new int[10001];

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        } //for

        // 0 = 문제의 입력 범위에 없으므로 제외
        for(int i = 1; i < arr.length; i++) {
            while(arr[i] > 0) {
                sb.append(i).append("\n");
                arr[i]--;
            } //while
        } //for

        System.out.print(sb);
    } //main
} //class