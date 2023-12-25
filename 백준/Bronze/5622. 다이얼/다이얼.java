import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int second = 0;

        for(int i = 0 ; i < str.length() ; i++){
            switch (str.charAt(i)){
                case 'A' : case 'B' : case 'C' :
                    second += 3;
                    break;

                case 'D' : case 'E' : case 'F' :
                    second += 4;
                    break;

                case 'G' : case 'H': case 'I' :
                    second += 5;
                    break;

                case 'J' : case 'K': case 'L' :
                    second += 6;
                    break;

                case 'M' : case 'N': case 'O' :
                    second += 7;
                    break;

                case 'P' : case 'Q': case 'R' : case 'S' :
                    second += 8;
                    break;

                case 'T' : case 'U': case 'V' :
                    second += 9;
                    break;

                case 'W' : case 'X': case 'Y' : case 'Z' :
                    second += 10;
                    break;
            } //switch
        } //for

        System.out.println(second);

        br.close();
    } //main
} //class



//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String str = br.readLine();
//        String[] Alphabet = { "", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
//
//        int second = 0;
//        for (int i = 0 ; i < str.length() ; i++) {
//            str.charAt(i);
//            for (int j = 0 ; j < Alphabet.length ; j++) {
//                
//                for (int k = 0 ; k < Alphabet[j].length() ; k++) {
//                    
//                    if (str.charAt(i) == Alphabet[j].charAt(k)) {
//                        second += (j + 1);
//                    } //if
//                    
//                } //for
//                
//            } //for
//            
//        } //for
//
//        System.out.println(second);
//
//        br.close();
//    } //main
//} //class
