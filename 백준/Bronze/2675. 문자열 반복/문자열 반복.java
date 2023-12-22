import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine());
            int repeat = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for(int j = 0; j < str.length(); j++) {
                for (int k = 0; k < repeat; k++) {
                    sb.append(str.charAt(j));
                } //for
            } //for
            
            
            sb.append("\n");
        } //for

        System.out.println(sb);
        br.close();
    } //main
} //class
