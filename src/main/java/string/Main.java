package string;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Man";
        String str3 = "Hello Man";
        String str_probel = " ";

        String str4 = (str1 + str_probel +str2).intern();

        System.out.println(str3.equals(str4));
    }
}
