package final_info.immutable;

public class Main {
    public static void main(String[] args) {
        String str1 = "I Love Java";

        String str2 = str1;

        System.out.println(str2);

        str1 = "I Love Python";

        System.out.println(str2);
    }
}
