import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        Arrays.setAll(arr, a -> -1);

        String str = br.readLine();

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);

            // [ch - 'a'] 해당 알파벳의 인덱스를 찾기 위해
            // 해당 알파벳의 인자가 -1인 경우에만 
            // => 같은 알파벳이 2번 나올경우 먼저나온 알파벳의 순서가 들어가야함
            if(arr[ch - 'a'] == -1){
                arr[ch - 'a'] = i;
            } //if
        } //for
        
        for(int value : arr){
            System.out.printf(value + " ");
        } //for

        br.close();
    } //main
} //class
