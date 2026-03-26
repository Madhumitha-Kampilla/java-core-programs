import java.util.Scanner;

class Main {
    public static void main(String[] args) { 
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String combine = "Hello " + word ;
        System.out.println(combine);
        sc.close();
        
    }
}
