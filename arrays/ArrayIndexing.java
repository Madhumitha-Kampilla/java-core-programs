import java.util.Arrays;
import java.util.Scanner;

public class ArrayIndexing{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = input.nextInt();
        
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = input.nextInt();
        }
        
        int[] arr1 = new int[t];
        for(int i=0; i<t; i++) {
             arr1[i] = input.nextInt();
        }
        
        for(int i=0; i<t; i++) {
            System.out.println(arr[arr1[i]]);
        }
    }
}
