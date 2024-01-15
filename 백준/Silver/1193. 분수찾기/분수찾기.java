import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        br.close();

        int count = 1;
        int countSum = 0;

        while(true){
            if(a <= countSum + count){
                if(count % 2 == 1){
                    System.out.println((count - (a - countSum - 1)) + "/" + (a - countSum));
                    break;
                } else{
                    System.out.println((a - countSum) + "/" + (count - (a - countSum - 1)));
                    break;
                } //if-else
            } else{
                countSum += count;
                count++;
            } //if-else
        } //wjile

    } //main
} //class

