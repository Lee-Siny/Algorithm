import java.io.StringReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String str = "";

        for(int i = 1 ; i <= n/4 ; i++){
            str += "long ";
        } //for

        System.out.println(str + "int");

        sc.close();
    } //main
} //class


//public class Main {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        StringBuilder sb = new StringBuilder();
//
//        for(int i = 1 ; i <= n/4 ; i++){
//            sb.append("long ");
//        } //for
//
//        sb.append("int");
//
//        System.out.println(sb);
//        
//        sc.close();
//    } //main
//} //class


//public class Main {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        String str = "long ";
//
//        String answer = str.repeat(n / 4) + "int";
//
//        System.out.println(answer);
//
//        sc.close();
//    } //main
//} //class
