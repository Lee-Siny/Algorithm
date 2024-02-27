import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= n; i++) {
            // offer() : 데이터 삽입
            queue.offer(i);
        } //for

        while(queue.size() > 1) {
            // poll() : 헤드 데이터 추출 후 삭제
            queue.poll();   // 맨 앞의 원소 삭제
            queue.offer(queue.poll());  // 맨 앞의 원소를 삭제하고, 해당 원소를 맨 뒤에 삽입
        } //while

        // peek() : 헤드 데이터 조회
        System.out.println(queue.peek());
        br.close();
    } //main
} //class

