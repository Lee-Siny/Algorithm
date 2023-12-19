import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < t ; i++){
            String str = br.readLine();

//            System.out.print(String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(str.length()-1)) +"\n");
            
            // substring(a, b) : a포함 b제외 , substring(a) : a부터 끝까지
            System.out.print(str.substring(0, 1));
            System.out.println(str.substring(str.length() - 1, str.length()));
        } //for

        br.close();
    } //main
} //class
