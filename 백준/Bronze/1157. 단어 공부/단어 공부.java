import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();
        int[] alphabetArr = new int[26];

        for(int i = 0; i < str.length(); i++){
            alphabetArr[str.charAt(i) - 'A']++;
//            alphabetArr[str.charAt(i) - 65]++;
        } //for

        int max = -1;
        char ch = '?';
        for(int j = 0; j < alphabetArr.length; j++){
            if(max < alphabetArr[j]){
                max = alphabetArr[j];
//                ch = (char) (j + 65);
                ch = (char) (j + 'A');
            } else if(max == alphabetArr[j]){
                ch = '?';
            } //else-if
        } //for

        System.out.println(ch);

        br.close();
    } //main
} //class


