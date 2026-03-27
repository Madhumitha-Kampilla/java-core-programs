import java.util.Scanner;

public class SumOfElements{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
        String[] nums = num.split(" ");
        
        int len = nums.length;
        int sum = 0;
        for(int i=0; i<len; i++) {
            int n = Integer.parseInt(nums[i]);
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
