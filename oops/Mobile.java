import java.util.Scanner;



public class Mobile {
    String name;
    long phoneNum;
    
    public void createContact(String personName, long phoneNum) {
        System.out.println(personName);
        System.out.println(phoneNum);
    } 
    
    public void createContact(String personName, long phoneNum1, long phoneNum2) {
        System.out.println(personName);
        System.out.println(phoneNum1);
        System.out.println(phoneNum2);
    } 
}

class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        Scanner input = new Scanner(System.in);
        mobile.createContact(input.next(), input.nextLong());
        mobile.createContact(input.next(), input.nextLong(), input.nextLong());
        input.close();
    }
}


