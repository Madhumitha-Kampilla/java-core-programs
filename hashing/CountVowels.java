import java.util.Scanner;

public class CountVowels {
    static int countTheVowels(String s)
    {
        int count = 0;
        for(char ch : s.toCharArray()){
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countTheVowels(s));
        sc.close();
    }
}
