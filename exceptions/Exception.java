import java.util.Scanner;

public class ExceptionHandling{ 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
           String str = input.nextLine();
           String[] str_arr = str.split(" ");
           int a = Integer.parseInt(str_arr[0]);
           int b = Integer.parseInt(str_arr[1]);
           int result = a / b;
           System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Denominator can't be 0");
        }catch (NumberFormatException e) {
            System.out.println("Input should be an integer");
        }
    }
}
