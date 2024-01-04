import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        
        // element 넣기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            } //for
        } //for
        
        
        // 행렬B를 따로 만들지 않고 행렬A의 인자와 더한 후 StringBuilder에 append
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < m; j++) {
                sb.append(arr[i][j] + Integer.parseInt(st.nextToken()) + " ");
            } //for
            
            sb.append("\n");
        } //for
        
        System.out.println(sb);

        br.close();
    } //main
} //class