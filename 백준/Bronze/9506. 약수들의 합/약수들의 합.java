import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            int n = Integer.parseInt(br.readLine());

            if(n == -1) break;

            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0;

            for(int i = 1; i < n ; i++) {
                if(n % i == 0) {
                    list.add(i);
                    sum += i;
                } //if
            } //for

            Collections.sort(list);

            if(n == sum){
                sb.append(n).append(" = ");

                for(int i = 0; i < list.size() - 1; i++){
                    sb.append(list.get(i)).append(" + ");
                } //for

                sb.append(list.get(list.size() - 1));

            } else {
                sb.append(n).append(" is NOT perfect.");
            } //if-else

            sb.append("\n");
        } //while

        System.out.println(sb);
        br.close();
    } //main
} //class

