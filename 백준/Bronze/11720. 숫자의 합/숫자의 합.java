import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int sum = 0;

        for(String e : str.split("")){
            sum += Integer.parseInt(e);
        } //for

        System.out.println(sum);
        
        br.close();
    } //main
} //class
