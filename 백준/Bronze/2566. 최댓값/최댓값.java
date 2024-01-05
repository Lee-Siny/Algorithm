import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[][] arr = new int[9][9];
        int max = Integer.MIN_VALUE;

        int x = -1;     // 행
        int y = -1;     // 열

        for (int i = 0; i < 9; i++){
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());

                if (max < arr[i][j]){
                    max = arr[i][j];
                    x = i + 1;
                    y = j + 1;
                } //if
            } //for
        } //for

        sb.append(max).append("\n").append(x).append(" ").append(y);
        System.out.println(sb);

        br.close();
    } //main
} //class

