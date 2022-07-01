package code_wars.printer_errors;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final String input1 = "aabbbxx";

        System.out.println(printerError(input1));

    }

    public static String printerError(String s) {

        int countErrors = 0;
        int length = s.length();

        for(int i = 0 ; i < length ; i++){
            if((int) s.charAt(i) < 97 || (int) s.charAt(i) > 109){
                countErrors++;
            }
        }
        return countErrors + "/" + length;
    }

    /*
    String errors = s.replaceAll("[a-m]","");
        return "" + errors.length() + "/" + s.length();

     */
}
