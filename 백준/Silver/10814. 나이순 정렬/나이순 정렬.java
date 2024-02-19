import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        String[][] arr = new String[n][2];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        } //for

//        Arrays.sort(arr, new Comparator<String[]>() {
//            @Override
//            public int compare(String[] str1, String[] str2) {
//                return Integer.parseInt(str1[0]) - Integer.parseInt(str2[0]);
//            } //compare()
//        });

//        Arrays.sort(arr, (str1, str2) -> Integer.parseInt(str1[0]) - Integer.parseInt(str2[0]));
        Arrays.sort(arr, Comparator.comparingInt(str -> Integer.parseInt(str[0])));

        for(int i = 0; i < n; i++) {
            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
        } //for

        System.out.println(sb);
    } //main
} //class