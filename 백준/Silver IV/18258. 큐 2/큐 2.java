import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// FIFO : First In, First Out
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // Queue 인터페이스로 선언하면 가장 뒤에 있는 요소를 반환 불가

        // LinkedList는 Deque(Queue를 상속받고 있음)도 구현하고 있어 큐 메소드 사용가능
        // LinkedList<Integer> queue = new LinkedList<>();

        // Deque 인터페이스로 선언 후 LinkedList나 ArrayDeque로 생성하여 큐 메소드 사용가능
        // Deque<Integer> queue = new LinkedList<>();
        Deque<Integer> queue = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());

            switch(st.nextToken()) {
                case "push" :   // 정수 X를 큐애 넣음
                    // offer : 큐의 맨 뒤에 요소 추가
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;

                case "pop" :
                    // poll : 큐의 가장 앞 요소 삭제, 삭제할 요소가 없으면 null return
                    Integer element = queue.poll();
                    if(element == null) sb.append(-1).append("\n");
                    else sb.append(element).append("\n");
                    break;

                case "size" :
                    sb.append(queue.size()).append("\n");
                    break;

                case "empty" :
                    if(queue.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;

                case "front" :
                    // peek : 큐의 가장 앞 요소 꺼냄, 큐에 꺼낼 요소가 없으면 null return
                    Integer frontElement = queue.peek();
                    if(frontElement == null) sb.append(-1).append("\n");
                    else sb.append(frontElement).append("\n");
                    break;

                case "back" :
                    // peekLast : 큐의 가장 마지막 요소 꺼냄, 큐에 꺼낼 요소가 없으면 null return
                    Integer backElement = queue.peekLast();
                    if(backElement == null) sb.append(-1).append("\n");
                    else sb.append(backElement).append("\n");
                    break;
            } //switch
        } //for

        System.out.println(sb);
    } //main
} //class