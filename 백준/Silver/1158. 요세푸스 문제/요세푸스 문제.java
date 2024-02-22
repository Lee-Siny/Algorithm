import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= n; i++) {
            // add() : 큐가 꽉 찬 경우 IllegalStateException 에러 발생
            // offer() : 큐가 꽉 찬 경우 false 반환
            queue.offer(i);
        } //for

        sb.append('<');

        while(queue.size() != 1) {
            for(int i = 0; i < k - 1; i++) {
                // remove() : 큐가 비어 있는 경우 NoSuchElementException 에러 발생
                // poll() : 큐가 비어 있을 경우 null 반환
                queue.offer(queue.poll());
            } //for

            sb.append(queue.poll()).append(", ");
        } //while

        // 마지막 값
        sb.append(queue.poll()).append('>');

        System.out.println(sb);
    } //main
} //class

