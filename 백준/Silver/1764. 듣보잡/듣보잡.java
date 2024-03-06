import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            map.put(br.readLine(), 0);
        } //for

        for(int i = 0; i < m; i++) {
            String name = br.readLine();
//            map.put(name, map.getOrDefault(name, 0) + 1);

            if(map.containsKey(name)) {
                list.add(name);
            } //if
        } //for

        StringBuilder sb = new StringBuilder();
        Collections.sort(list);

        sb.append(list.size()).append('\n');
        for(String str : list) {
            sb.append(str).append('\n');
        } //for

        System.out.println(sb);

        br.close();
    } //main
} //class

