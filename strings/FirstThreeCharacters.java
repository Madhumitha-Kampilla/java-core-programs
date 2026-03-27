import java.util.Scanner;

public class FirstThreeCharacters{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String part = word.substring(0,3);
        System.out.println(part);
    }
}
