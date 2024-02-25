import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//
//        Map<String, Integer> map = new HashMap<>();
//
//        for(int  i = 0; i < n; i++) {
//            map.put(br.readLine(), 0);
//        } //for
//
//        int count = 0;
//        for (int i = 0; i < m; i++) {
//            if(map.containsKey(br.readLine())) count++;
//        } //for
//
//        System.out.println(count);
//    } //main
//} //class


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();

        for(int  i = 0; i < n; i++) {
            set.add(br.readLine());
        } //for

        int count = 0;
        for (int i = 0; i < m; i++) {
            if(set.contains(br.readLine())) count++;
        } //for

        System.out.println(count);
    } //main
} //class

