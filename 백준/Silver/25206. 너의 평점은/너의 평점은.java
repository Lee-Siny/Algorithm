import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static double sum = 0.0;   // 학점 x 과목평점의 합
    static double sumMark = 0.0;   // 이수한 과목의 총 학점
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());

            String object = st.nextToken();
            double mark = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            sum(mark, grade);
        } //for

        System.out.println(sum / sumMark);

        br.close();
    } //main

    // 과목 평점 Return
    public static void sum(double mark, String grade) {
        switch (grade) {
            case "A+" : {
                sum += (mark * 4.5);
                sumMark += mark;
                break;
            }
            case "A0" : {
                sum += (mark * 4.0);
                sumMark += mark;
                break;
            }
            case "B+" : {
                sum += (mark * 3.5);
                sumMark += mark;
                break;
            }
            case "B0" : {
                sum += (mark * 3.0);
                sumMark += mark;
                break;
            }
            case "C+" : {
                sum += (mark * 2.5);
                sumMark += mark;
                break;
            }
            case "C0" : {
                sum += (mark * 2.0);
                sumMark += mark;
                break;
            }
            case "D+" : {
                sum += (mark * 1.5);
                sumMark += mark;
                break;
            }
            case "D0" : {
                sum += (mark * 1.0);
                sumMark += mark;
                break;
            }
            case "F" : {
                sum += (mark * 0.0);
                sumMark += mark;
                break;
            }
            case "P" :{
                break;
            }
        } //switch
    } //avg()

} //class


