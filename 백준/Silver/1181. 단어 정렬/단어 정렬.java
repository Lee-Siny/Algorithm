import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];

        for(int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        } //for

//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String str1, String str2) {
//                if(str1.length() == str2.length()) {
//                    return str1.compareTo(str2);
//                } else {
//                    return str1.length() - str2.length();
//                } //if-else
//            } //compare()
//        });

        Arrays.sort(arr, (str1, str2) -> {
            if(str1.length() == str2.length()) {
                return str1.compareTo(str2);    // => 사전순 정렬
            } else { // => 문자열 길이 비교
                // 음수 값 = str1이 짧음, 양수값 = str2가 짧음
                return str1.length() - str2.length();
            } //if-else
        });

        // '\n' , "\n"
        // => 미미한 차이지만 속도측면에서 append(char)는 단일 문자만 처리하면되기에 '\n' 사용하자!
        sb.append(arr[0]).append('\n');

        for (int i = 1; i < n; i++) {
            // 중복되지 않는 단어만 출력
            if (!arr[i].equals(arr[i - 1])) {
                sb.append(arr[i]).append('\n');
            } //if
        } //for

        System.out.println(sb);
    } //main
} //class