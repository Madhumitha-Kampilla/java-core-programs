import java.util.Scanner;

public class LastCharacterInString{
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String word = str.nextLine();
        int len = word.length();
        System.out.println(word.charAt(len - 1));
    }
}
