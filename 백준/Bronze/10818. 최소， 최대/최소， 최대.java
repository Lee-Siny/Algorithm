import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        } //for

//        int index = 0;
//        while(st.hasMoreTokens()) {
//            arr[index] = Integer.parseInt(st.nextToken());
//            index++;
//        } //while

        Arrays.sort(arr);
        sb.append(arr[0]).append(" ").append(arr[n - 1]);
        System.out.println(sb);

        br.close();
    } //main
} //class


//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        
//        st = new StringTokenizer(br.readLine());
//
//        for(int i = 0 ; i < n ; i++) {
//            int number = Integer.parseInt(st.nextToken());
//            min = Math.min(min, number);
//            max = Math.max(max, number);
//        } //for
//        
//        sb.append(min).append(" ").append(max);
//        System.out.println(sb);
//
//        br.close();
//    } //main
//} //class
