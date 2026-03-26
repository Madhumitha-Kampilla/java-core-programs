import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String word = str.nextLine();
        int num = str.nextInt();
        System.out.println(word.charAt(num));
    }
}
