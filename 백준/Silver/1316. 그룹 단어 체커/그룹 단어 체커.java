import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (check() == true) {
                count++;
            } //if
        } //for

        System.out.println(count);

        br.close();
    } //main

    public static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = br.readLine();

        for(int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            // 이전 문자와 i 번째 문자 비교
            if (prev != now) {
                if ( check[now - 'a'] == false ) {  // i번째 문자가 처음 나옴
                    check[now - 'a'] = true;        // 해당 알파벳 등장(?) 여부 true
                    prev = now;					    // 다음 문자 판별을 위해 대입
                } else {  // true = 해당 문자가 이미 나온 적이 있음 (= 그룹단어가 아님)
                    return false;   // 종료 후 false return
                } // if-else
            } else {  // 앞선 문자와 i 번째 문자가 같음 (= 연속된 문자)
                continue;
            } // if
        } //for

        // 그룹단어가 아님
        return true;
    } //check()
    
} //class


