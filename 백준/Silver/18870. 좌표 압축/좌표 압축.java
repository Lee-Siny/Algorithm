import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] origin = new int[n];
        int[] sorted = new int[n];
        HashMap<Integer, Integer> rankingMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
        } //for

        Arrays.sort(sorted);

        int rank = 0;   // map의 value값
        for(int element : sorted) {
            // 원소가 중복되지 않을때만 Map에 넣어줌
            // containsKey(Object key)
            // => 매개변수로 주어진 key가 맵에 존재하는지 여부를 검사
            // => key가 맵에 존재하면 true를, 그렇지 않으면 false를 반환
            if(!rankingMap.containsKey(element)) {
                rankingMap.put(element, rank);
                rank++;
            } //if
        } //for

        StringBuilder sb = new StringBuilder();
        for(int key : origin) {
            // 원본 배열 원소에 해당하는 map의 value를 get
            int ranking = rankingMap.get(key);
            sb.append(ranking).append(' ');
        } //enhanced for
        
        System.out.println(sb);
    } //main
} //class