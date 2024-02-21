import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// HashMap을 이용한 풀이
// => key의 값이 중복되는 데이터가 추가되면, 기존의 해당 key의 value가 새로 갱신되는 성질
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        HashMap<String, Integer> card = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            card.put(st.nextToken(), 0);
        } //for

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            // get() => key return
            if(card.get(st.nextToken()) != null) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            } //if-else
        } //for

        System.out.println(sb);
    } //main
} //class


// 이분탐색 직접구현
//public class Main {
//    static int n, m;
//    static int[] card;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//
//        n = Integer.parseInt(br.readLine());
//        card = new int[n];
//        st = new StringTokenizer(br.readLine());
//        for(int i = 0; i < n; i++) {
//            card[i] = Integer.parseInt(st.nextToken());
//        } //for
//
//        Arrays.sort(card);
//
//        m = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine());
//        for(int i = 0; i < m; i++) {
//            int num = Integer.parseInt(st.nextToken());
//
//            sb.append(binarySearch(num)).append(" ");
//        } //for
//
//        System.out.println(sb);
//    } //main
//
//    public static int binarySearch(int num) {
//        int leftIndex = 0;
//        int rightIndex = n - 1;
//
//        // leftIndex가 rightIndex보다 큰 경우는 이진 탐색 규칙에 어긋남 => 반복문 X
//        while(leftIndex <= rightIndex){
//            int midIndex = (leftIndex + rightIndex) / 2;
//            int midValue = card[midIndex];
//
//            if(num > midValue) { // num이 midValue보다 큼
//                leftIndex = midIndex + 1;
//            } else if(num < midValue) { // num이 midValue보다 작음
//                rightIndex = midIndex - 1;
//            } else { // num == midValue
//                return 1;
//            } //else-if
//        } //while
//
//        // card[]에 num과 일치하는 값이 없을 경우
//        return 0;
//    } //bibarySearch()
//} //class


// binarySearch()를 이용한 풀이
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//
//        int n = Integer.parseInt(br.readLine());
//        int[] card = new int[n];
//        st = new StringTokenizer(br.readLine());
//        for(int i = 0; i < n; i++) {
//            card[i] = Integer.parseInt(st.nextToken());
//        } //for
//
//        Arrays.sort(card);
//
//        int m = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine());
//        for(int i = 0; i < m; i++) {
//            int num = Integer.parseInt(st.nextToken());
//
//            // binarySearch() = 이진탐색
//            // 찾고자 하는 값이 배열에 있으면 양의 값 return
//            // 찾고자 하는 값이 배열에 없으면 음의 값 return
//            if(Arrays.binarySearch(card, num) > 0) {
//                sb.append("1 ");
//            } else {
//                sb.append("0 ");
//            } //if-else
//        } //for
//
//        System.out.println(sb);
//    } //main
//} //class

