import java.util.Scanner;
import java.util.Arrays;

public class ReverseOrder{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        
        String[] arr = new String[n];
        for(int i=0; i<n; i++) {
           arr[i] = input.nextLine();
        }
        for(int j=n-1; j>=0; j--) {
            System.out.println(arr[j]);
        }
    }
