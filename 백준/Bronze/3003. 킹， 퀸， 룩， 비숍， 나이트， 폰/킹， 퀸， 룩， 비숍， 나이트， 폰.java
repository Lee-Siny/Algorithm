import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int[] chess = new int[]{1, 1, 2, 2, 2, 8};
        int[] piece = new int[6];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < piece.length; i++){
            piece[i] = Integer.parseInt(st.nextToken());
        } //for

        for(int j = 0; j < chess.length; j++){
            sb.append(chess[j] - piece[j]).append(" ");
        } //for

        System.out.println(sb);

        br.close();
    } //main
} //class
