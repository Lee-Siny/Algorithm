import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<String, String> office = new HashMap<>();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            office.put(st.nextToken(), st.nextToken());
        } //for

        List<String> employee = new ArrayList<>(office.keySet());
        Collections.sort(employee, Collections.reverseOrder());
//        Collections.sort(employee,(a,b) -> b.compareTo(a));

        StringBuilder sb = new StringBuilder();
        for(String name : employee) {
            if(office.get(name).equals("enter")) {
                sb.append(name).append('\n');
            } //if
        } //for

        System.out.println(sb);
        br.close();
    } //main
} //class

