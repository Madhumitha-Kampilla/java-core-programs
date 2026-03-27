import java.util.Scanner;

public class SumOfDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        
        int len = num.length();
        
        int total = 0;
        if (len==1) {
            total = Integer.parseInt(num);
        }
        else if (len==2) {
            int number = Integer.parseInt(num);
            total = total + number%10;
            total = total + number/10;
            
        }
        else if (len==3) {
            int number = Integer.parseInt(num);
            total = total + number / 100;   
            number = number%100;        
            total = total + number/10;      
            number = number % 10 ;          
            total = total+number;
        }
        else if (len==4) {
            int number = Integer.parseInt(num);
            total = total+number/1000; 
            number = number % 1000;     
            total = total+number/100;  
            number = number % 100;      
            total = total+number/10; 
            total = total+number%10;
        }
        System.out.println(total)   ;
    }
}
