import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<Integer, String> pokemon1 = new HashMap<>();
        Map<String, Integer> pokemon2 = new HashMap<>();

        for(int i = 1; i <= n; i++) {
            String name = br.readLine();
            pokemon1.put(i, name);
            pokemon2.put(name, i);
        } //for

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++) {
            String str = br.readLine();

            // Character.isDigit(str.charAt(0)) : 문자열 str의 첫 번째 문자가 숫자인지 아닌지를 판별
            if(Character.isDigit(str.charAt(0))) {
                sb.append(pokemon1.get(Integer.parseInt(str))).append('\n');
            } else {
                sb.append(pokemon2.get(str)).append('\n');
            } //if-else
        } //for

        System.out.println(sb);

        br.close();
    } //main
} //class

