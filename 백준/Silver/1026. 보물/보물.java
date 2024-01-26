import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        // Array A
        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arrA = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            arrA.add(Integer.parseInt(st.nextToken()));
        } //for

//        Collections.sort(arrA);
        arrA.sort(Comparator.naturalOrder());

        // Array B
        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arrB = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            arrB.add(Integer.parseInt(st.nextToken()));
        } //for

//        Collections.sort(arrB, Comparator.reverseOrder());
        arrB.sort(Comparator.reverseOrder());
        
        int result = 0;
        for(int i = 0; i < n; i++) {
            result += arrA.get(i) * arrB.get(i);
        } //for

        System.out.println(result);
    } //main
} //class