import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//
//        int n = Integer.parseInt(br.readLine());
//
//        String[][] arr = new String[n][2];
//
//        for(int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//
//            arr[i][0] = st.nextToken();
//            arr[i][1] = st.nextToken();
//        } //for
//
////        Arrays.sort(arr, new Comparator<String[]>() {
////            @Override
////            public int compare(String[] str1, String[] str2) {
////                return Integer.parseInt(str1[0]) - Integer.parseInt(str2[0]);
////            } //compare()
////        });
//
////        Arrays.sort(arr, (str1, str2) -> Integer.parseInt(str1[0]) - Integer.parseInt(str2[0]));
//        Arrays.sort(arr, Comparator.comparingInt(str -> Integer.parseInt(str[0])));
//
//        for(int i = 0; i < n; i++) {
//            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
//        } //for
//
//        System.out.println(sb);
//    } //main
//} //class


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 1 ~ 200
        StringBuilder[] p = new StringBuilder[201];

        //객체배열의 인덱스에 각 StringBuilder 객 생성
        for(int i = 0; i < p.length; i++) {
            p[i] = new StringBuilder();
        } //for

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            // 카운팅 정렬 : 나이를 index 로 하여 해당 배열에 나이와 이름을 append()
            p[age].append(age).append(' ').append(name).append('\n');
        } //for

        StringBuilder sb = new StringBuilder();
        for(StringBuilder val : p) {
            sb.append(val);
        } //enhanced for

        System.out.println(sb);
    } //main
} //class