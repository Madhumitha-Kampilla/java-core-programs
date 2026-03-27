import java.util.Scanner;

public class FirstAndLastDigits{
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
        char firNum = num.charAt(0);
        char secNum = num.charAt(3);
        System.out.println(firNum);
        System.out.println(secNum);
    }
}
