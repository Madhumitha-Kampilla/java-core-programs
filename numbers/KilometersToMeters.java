import java.util.Scanner;

public class KilometersToMeters{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Float km = input.nextFloat();
        int meters = int  (km * 1000);
        System.out.println(meters);
        
    }
}
