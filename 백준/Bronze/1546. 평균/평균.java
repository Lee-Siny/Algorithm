import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double arr[] = new double[Integer.parseInt(br.readLine())];

        StringTokenizer st = new StringTokenizer(br.readLine());;
        
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = Double.parseDouble(st.nextToken());
        } //for

        Arrays.sort(arr);
        double max = arr[arr.length - 1];
        double sum = 0;

        for (double value : arr) {
            sum += (value / max * 100);
        } //for

        System.out.println(sum / arr.length);

        br.close();
    } //main
} //class
