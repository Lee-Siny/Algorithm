import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while ((str = br.readLine()) != null){
            System.out.println(str);
        } //while

        br.close();
    } //main
} //class

//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        while (true){
//            String str = br.readLine();
//
//            if(str == null || str.isEmpty()){
//                break;
//            } //if
//
//            sb.append(str).append("\n");
//        } //while
//
//        System.out.println(sb);
//
//        br.close();
//    } //main
//} //class