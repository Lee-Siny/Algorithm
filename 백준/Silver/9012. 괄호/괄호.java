import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            sb.append(ValidPS(br.readLine())).append("\n");
        } //for

        System.out.println(sb);
    } //main


    // 괄호의 모양이 바르게 구성된 문자열 = 올바른 괄호 문자열 (Valid PS, VPS)
    public static String ValidPS(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(') { // 여는 괄호를 입력 받음
                stack.push(c);
            } else { // 닫는 괄호를 입력 받음
                if (stack.empty()) {   // 스택이 비어있음 (pop불가)
                    return "NO";
                } else {    // 스택이 비어있지 않음 (pop가능)
                    stack.pop();
                } //if-else
            } //if-else
        } //enhanced for

        // 스택이 비어있으면 VPS성립
        if (stack.empty()) {
            return "YES";
        } else {
            return "NO";
        } //if-else
    } //ValidPS()

} //class