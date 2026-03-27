import java.util.Scanner;

public class LengthOfString{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        int noofChars = sentence.length();
        System.out.println(noofChars);
    }
}
