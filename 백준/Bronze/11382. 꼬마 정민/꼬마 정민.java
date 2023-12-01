import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] numbers = str.split(" ");

        long A = Long.parseLong(numbers[0]);
        long B = Long.parseLong(numbers[1]);
        long C = Long.parseLong(numbers[2]);

        System.out.println(A + B + C);
        sc.close();
    } //main
} //class


// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         long A = sc.nextLong();
//         long B = sc.nextLong();
//         long C = sc.nextLong();
        
//         System.out.println(A + B + C);
//         sc.close();
//     } //main
// } //class
