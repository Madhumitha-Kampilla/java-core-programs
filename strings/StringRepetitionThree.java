import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);
        String word = str.nextLine();
        int num = str.nextInt();
        int len = word.length();
        int letter = len - 3;
        String start = word.substring(letter);
        System.out.println(start.repeat(num));
    }
}
