import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new  int[5];

        for(int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        } //for

        Arrays.sort(arr);

        System.out.println(Math.round(Arrays.stream(arr).average().orElse(0)));
        System.out.println(arr[2]);
    } //main
} //class