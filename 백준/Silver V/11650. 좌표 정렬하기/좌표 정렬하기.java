import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        for(int i =0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        } //for

//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] e1, int[] e2) {
//                if(e1[0] == e2[0]) {
//                    return e1[1] - e2[1];
//                } else {
//                    return e1[0] - e2[0];
//                } //if-else
//            } //compare()
//        });

        // e1[0] = arr[1][0]
        // e1[1] = arr[1][1]
        // e2[0] = arr[2][0]
        // e2[1] = arr[2][1]
        // 음수 리턴시 e1이 e2의 앞에, 양수 리턴시 e1이 e2의 뒤에
        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            } //if-else
        });

        for(int i = 0; i < n; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        } //for

        System.out.print(sb);
    } //main
} //class