//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int n = Integer.parseInt(br.readLine());
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for(int i = 0; i < n; i++) {
//            list.add(Integer.parseInt(br.readLine()));
//        } //for
//
//        Collections.sort(list);
//
//        for(int result : list) {
//            sb.append(result).append("\n");
//        } //for
//
//        System.out.println(sb);
//    } //main
//} //class


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // -1000000 ~ 1000000
        boolean[] arr = new boolean[2000001];

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000000] = true;
        } //for

        for(int i = 0; i < arr.length; i++) {
            if(arr[i]) {
                sb.append((i - 1000000)).append("\n");
            } //if
        } //for

        System.out.print(sb);
    } //main
} //class