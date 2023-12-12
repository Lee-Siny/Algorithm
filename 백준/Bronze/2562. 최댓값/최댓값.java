import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[9];
        int max = Integer.MIN_VALUE;
        int index = 0;

        for(int i = 0 ; i < 9 ; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if(max < arr[i]){
                max = arr[i];
                index = i + 1;
            } // if
        } //for

//        int max = Arrays.stream(arr).max().getAsInt();

        sb.append(max).append("\n").append(index);
        System.out.println(sb);

        br.close();
    } //main
} //class

