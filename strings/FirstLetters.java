import java.util.Scanner;

public class FirstLetters {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        String str3 = input.nextLine();
        char firChar = str1.charAt(0);
        char secChar = str2.charAt(0);
        char thirdChar = str3.charAt(0);
        String cmpStr = "" + firChar + secChar + thirdChar;
        System.out.println(cmpStr);
    }
}
