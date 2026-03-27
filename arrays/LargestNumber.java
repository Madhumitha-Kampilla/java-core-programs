import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class LargestNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
        String[] numList = num.split(" ");
        
        int len = numList.length;
        int[] numbers = new int[len];
        for(int i=0; i<len; i++){
            numbers[i] = Integer.parseInt(numList[i]);
        }
        Arrays.sort(numbers);
        System.out.println(numbers[len-1]);
        
    }
}
