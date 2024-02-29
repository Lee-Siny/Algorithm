import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push_front": {
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                }
                case "push_back": {
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                }
                case "pop_front": {
                    if (deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.pollFirst()).append('\n');
                    } //if-else
                    break;
                }
                case "pop_back": {
                    if (deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.pollLast()).append('\n');
                    } //if-else
                    break;
                }
                case "size": {
                    sb.append(deque.size()).append('\n');
                    break;
                }
                case "empty": {
                    if (deque.isEmpty()) {
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    } //if-else
                    break;
                }
                case "front": {
                    if (deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.peekFirst()).append('\n');
                    } //if-else
                    break;
                }
                case "back": {
                    if (deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.peekLast()).append('\n');
                    } //if-else
                    break;
                }
            } //switch
        } //for

        System.out.println(sb);

        br.close();
    } //main
} //class

