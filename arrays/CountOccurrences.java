import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class CountOccurrences{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
    
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(5, 10, 20, 35, 5, 50, 20, 100, 200, 10, 150, 100, 100, 20, 20));
        int count = Collections.frequency(arr,n);
        System.out.println(count);
    }
}
