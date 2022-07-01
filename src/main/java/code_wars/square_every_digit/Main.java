package code_wars.square_every_digit;

//Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
//For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

public class Main {
    public static void main(String[] args) {
        int startNumber = 9119 ;
        System.out.println(squareDigits(startNumber));
    }

    public static int squareDigits(int n) {
        // TODO Implement me
        String numberToString = Integer.toString(n);
        String finalString = "";
        int finalNumber = 0;

        for(int i = 0 ; i < numberToString.length() ; i++){
            int temp = 0;
            temp = Character.getNumericValue(numberToString.charAt(i)) *
                    Character.getNumericValue(numberToString.charAt(i));
            finalString = finalString + temp;
        }

        finalNumber = Integer.parseInt(finalString);

        return finalNumber;

        /*
        return Integer.parseInt(String.valueOf(n)
                .chars()
                .map(i -> Integer.parseInt(String.valueOf((char) i)))
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("")));

         */
    }
}
