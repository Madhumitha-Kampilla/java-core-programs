import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class StudentIDMap{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String names = input.nextLine();
        String ids = input.nextLine();
        
        String[] name = names.split(",");
        String[] id = ids.split(",");
        
        HashMap<String, String> hmap = new HashMap<>();
        for(int i=0; i<name.length; i++) {
            hmap.put(name[i], id[i]);
        }
        
        ArrayList<String> members = new ArrayList<>(hmap.keySet());
        Collections.sort(members);
        
        for(String key:members) {
            System.out.println(key+":"+hmap.get(key));
        }
    }
}
