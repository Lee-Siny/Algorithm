import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String line = br.readLine();
            if(line == null){
                break;
            } //if

            StringTokenizer st = new StringTokenizer(line);

            int coupon = Integer.parseInt(st.nextToken());
            int stamp = Integer.parseInt(st.nextToken());
            int order = 0;

            System.out.println(chicken(coupon, stamp, order));
        } // while

        br.close();
    } //main

    // 재귀 호출
    public static int chicken(int coupon, int stamp, int order){
        if (coupon < stamp) {
            return order + coupon;
        } //if

        // coupon = (coupon / stamp) + (coupon % stamp)
        // stamp = stamp (불변)
        // order = order + (coupon - coupon % stamp)
        return chicken((coupon / stamp) + (coupon % stamp), stamp, order + (coupon - coupon % stamp));
    } //chicken()
} //class

