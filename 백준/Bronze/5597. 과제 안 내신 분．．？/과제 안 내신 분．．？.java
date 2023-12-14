import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] students = new int[30];

        for(int i = 0 ; i < 28 ; i++){
            int success = Integer.parseInt(br.readLine());

            students[success-1] = 1;
        } //for

        for (int i = 0 ; i < 30 ; i++){
            if (students[i] == 0) {
                System.out.println(i + 1);
            } //if
        } //for

        br.close();
    } //main
} //class

