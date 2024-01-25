import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] coordinate1 = br.readLine().split(" ");
        String[] coordinate2 = br.readLine().split(" ");
        String[] coordinate3 = br.readLine().split(" ");

        String x;
        String y;

        // x 좌표 비교
        if (coordinate1[0].equals(coordinate2[0])) {    // 1, 2 비교
            x = coordinate3[0];
        } else if (coordinate1[0].equals(coordinate3[0])) { // 1, 3 비교
            x = coordinate2[0];
        } else {    // 2, 3 비교
            x = coordinate1[0];
        } //else-if

        // y 좌표 비교
        if (coordinate1[1].equals(coordinate2[1])) {
            y = coordinate3[1];
        } else if (coordinate1[1].equals(coordinate3[1])) {
            y = coordinate2[1];
        } else {
            y = coordinate1[1];
        } //else-if

        System.out.println(x + " " + y);
    } //main
} //class