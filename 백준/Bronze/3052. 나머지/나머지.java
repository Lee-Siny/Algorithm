import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] arr = new boolean[42];

        for(int i = 0 ; i < 10 ; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        } //for

        int count = 0;
        for(boolean value : arr) {
            if(value){    // value 가 true 라면
                count++;
            } //if
        } //for

        System.out.println(count);

        br.close();
    } //main
} //class


//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        HashSet<Integer> h = new HashSet<Integer>();
//
//        for (int i = 0; i < 10; i++) {
//            h.add(Integer.parseInt(br.readLine()) % 42);
//        }
//
//        // HashSet.size() 는 HashSet 의 크기(= 저장되어 있는 원소의 개수)를 반환
//        System.out.print(h.size());
//
//        br.close();
//    } //main
//} //class
