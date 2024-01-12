import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 1;
        int range = 1;

        if(n == 1){
            System.out.println(1);
        } else {
            while(n > range){
                range += (6 * count);
                count++;
            } //while
            System.out.println(count);
        } //if-else

        br.close();
    } //main
} //class
