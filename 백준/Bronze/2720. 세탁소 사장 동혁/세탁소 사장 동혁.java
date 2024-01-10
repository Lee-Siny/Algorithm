import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        for(int i = 0; i < t; i++){
            int change = Integer.parseInt(br.readLine());

            sb.append(change / quarter).append(" ");
            change %= quarter;

            sb.append(change / dime).append(" ");
            change %= dime;

            sb.append(change / nickel).append(" ");
            change %= nickel;

            sb.append(change / penny).append(" ");
            change %= penny;
        } //for

        System.out.println(sb);

        br.close();
    } //main
} //class

//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int t = Integer.parseInt(br.readLine());
//        int[] coins = {25, 10, 5, 1};
//
//        for(int i = 0; i < t; i++){
//            int change = Integer.parseInt(br.readLine());
//
//            for(int coin : coins){
//                sb.append(change / coin).append(" ");
//                change %= coin;
//            } //for
//        } //for
//
//        System.out.println(sb);
//
//        br.close();
//    } //main
//} //class

