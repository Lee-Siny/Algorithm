import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int angleA = Integer.parseInt(br.readLine());
        int angleB = Integer.parseInt(br.readLine());
        int angleC = Integer.parseInt(br.readLine());

        if (angleA + angleB + angleC != 180) {
            System.out.print("Error");
        } else {
            if (angleA == 60 && angleB == 60 && angleC == 60) {
                System.out.print("Equilateral");
            } else if (angleA == angleB || angleA == angleC || angleB == angleC) {
                System.out.print("Isosceles");
            } else {
                System.out.println("Scalene");
            } //else-if
        } //if-else

    } //main
} //class