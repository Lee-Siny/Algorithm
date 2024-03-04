import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int key = Integer.parseInt(st.nextToken());

            // getOrDefault(key, defaultValue)
            // map에 저장 된 key의 value를 반환 => 만약 value가 없을 경우 defaultValue를 반환
            map.put(key, map.getOrDefault(key, 0) + 1);
        } //for


        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            int key = Integer.parseInt(st.nextToken());

            // map에 저장되지 않은 키의 값은 0 => 따라서 default value를 설정해줌
            sb.append(map.getOrDefault(key, 0)).append(' ');
        } //for

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
//        int[] counting = new int[20000001];
//
//        int n = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine());
//        for(int i = 0; i < n; i++) {
//            counting[Integer.parseInt(st.nextToken()) + 10000000]++;
//        } //for
//
//
//        int m = Integer.parseInt(br.readLine());
//
//        st = new StringTokenizer(br.readLine());
//        for(int i = 0; i < m; i++) {
//            sb.append(counting[Integer.parseInt(st.nextToken()) + 10000000]).append(' ');
//        } //for
//
//        System.out.println(sb);
//
//        br.close();
//    } //main
//} //class