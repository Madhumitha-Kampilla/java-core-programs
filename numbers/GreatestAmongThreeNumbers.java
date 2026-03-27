import java.util.Scanner;

public class GreatestAmongThreeNumbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        if (a>b && a>c) {
            System.out.println(a);
        }
        else if (b>c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }
}
