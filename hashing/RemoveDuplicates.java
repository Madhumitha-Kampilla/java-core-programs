import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;

public class RemoveDuplicates{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nums = input.nextLine();
        
        String[] num_List = nums.split(" ");
        HashSet<Integer> hset = new HashSet<>();
        for(int i=0; i<num_List.length; i++) {
            hset.add(Integer.parseInt(num_List[i]));
        }
        ArrayList<Integer> arr = new ArrayList<>(hset);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
