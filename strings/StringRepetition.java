import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int num = input.nextInt();
        System.out.println((word+" ").repeat(num));
        
    }
}
