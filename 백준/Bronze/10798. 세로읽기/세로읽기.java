import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[][] arr = new char[5][15];
        int max = 0;

        for (int i = 0; i < arr.length; i++){
            String str = br.readLine();

            // 배열을 순회하면서 자원을 낭비하지 않기 위해 max값을 저장 해놓음
            if(max < str.length()){
                max = str.length();
            } //if

            // 배열에 인자 저장
            for (int j = 0; j < str.length(); j++){
                arr[i][j] = str.charAt(j);
            } //for
        } //for

        // 출력 값 순회하면서 append
        // max값으로 값을 저장하지 않은 column은 순회하지 않도록 함
        for (int i = 0; i < max; i++){
            for (int j = 0; j < 5; j++){
                // 값을 담지 않은 column의 초기값 = '\0' (null)
                if (arr[j][i] == '\0'){
                    continue;   //해당 column은 append하지 않음
                } //if
                sb.append(arr[j][i]);
            } //for
        } //for

        System.out.println(sb);

        br.close();
    } //main
} //class