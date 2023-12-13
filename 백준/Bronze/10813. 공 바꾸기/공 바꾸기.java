import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int M = Integer.parseInt(st.nextToken());
        int temp;

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = i + 1;
        } //for
        
        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());

            temp = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = temp;
        } //for

        for(int value : arr){
            sb.append(value).append(" ");
        } //for

        System.out.println(sb);

        br.close();
    } //main
} //class

