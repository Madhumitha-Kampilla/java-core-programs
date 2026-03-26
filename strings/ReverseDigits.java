import java.util.Scanner;

class Main {
    public static void main(String[] args) { 
        // Write your code here
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
        char a = num.charAt(1);
        char b = num.charAt(0) ;      
        System.out.print(a);
        System.out.print(b);
    }
}
