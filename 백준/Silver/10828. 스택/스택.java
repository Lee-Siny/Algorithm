import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch (str) {
                case "push" :   // 정수 X를 스택에 넣음
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop" :    // 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력
                    // 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력
                    if(!stack.empty()) sb.append(stack.pop()).append("\n");
                    else sb.append(-1).append("\n");
                    break;

                case "size" :   // 스택에 들어있는 정수의 개수를 출력
                    sb.append(stack.size()).append("\n");
                    break;

                case "empty" :  // 스택이 비어있으면 1, 아니면 0을 출력
                    if(!stack.empty()) sb.append(0).append("\n");
                    else sb.append(1).append("\n");
                    break;

                case "top" :    // 스택의 가장 위에 있는 정수를 출력
                    // 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력
                    if(!stack.empty()) sb.append(stack.peek()).append("\n");
                    else sb.append(-1).append("\n");
                    break;
            } //switch

        } //for

        System.out.println(sb);
    } //main
} //class