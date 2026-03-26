import java.util.Scanner;

public class StringRepetition
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int num = input.nextInt();
        System.out.println((word+" ").repeat(num));
        
    }
}
