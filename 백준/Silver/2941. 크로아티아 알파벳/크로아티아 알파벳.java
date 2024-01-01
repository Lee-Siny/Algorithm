import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int length = str.length();
        int count = 0;

        for(int i = 0; i < length; i++) {
            char ch = str.charAt(i);

            if(ch == 'c' && i < length - 1) {   // c 판별 => c= or c-
                if(str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                    i++;
                } //if
            } else if(ch == 'd' && i < length - 1) {  // d 판별 => dz= or d-
                if(str.charAt(i + 1) == '-') {
                    i++;
                } else if(str.charAt(i + 1) == 'z' && i < length - 2) {
                    if(str.charAt(i + 2) == '=') {
                        i += 2;
                    } //if
                } //else-if
            } else if((ch == 'l' || ch == 'n') && i < length - 1) { // l or n 판별
                if(str.charAt(i + 1) == 'j') {  // lj or nj
                    i++;
                } // if
            } else if((ch == 's' || ch == 'z') && i < length - 1) { // s or z 판별
                if(str.charAt(i + 1) == '=') {	// s= or z=
                    i++;
                } //if
            } // if-else-if
            count++;
        } //for

        System.out.println(count);

        br.close();
    } //main
} //class


