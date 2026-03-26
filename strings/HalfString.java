import java.util.Scanner;

public class HalfString{
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);
        String word = str.nextLine();
        int len = word.length();
        int half_str = len/2;
        System.out.println(word.substring(0,half_str));
    }
}
