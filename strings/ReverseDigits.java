import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
        char a = num.charAt(1);
        char b = num.charAt(0) ;      
        System.out.print(a);
        System.out.print(b);
    }
}
