import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 시간 초과
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int v = Integer.parseInt(st.nextToken());
//        int meter = 0;
//        int day = 0;
//
//        while(!(meter >= v)){
//            day++;
//            meter += a;
//
//            if (meter >= v){
//                break;
//            } //if
//
//            meter -= b;
//        } //while
//
//        System.out.println(day);
//
//        br.close();
//    } //main
//} //class


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());

        int day = (length - down) / (up - down);

        if((length - down) % (up - down) != 0){
            day++;
        } //if

        System.out.println(day);
        
        br.close();
    } //main
} //class

