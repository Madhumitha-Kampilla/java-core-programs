import java.util.Scanner;


public class SavingsAccount {
   String name;
   private long accNo;
   private String email;
   private float amount;
   
   public SavingsAccount(String customerName) {
       this.name = customerName;
   }
   
   public void setAccNo(long accNo) {
       this.accNo = accNo;
   }
   
   public long getAccNo() {
       return this.accNo;
   }
   
   public void setEmail(String email){
       this.email = email;
   }
   
   public String getEmail() {
       return this.email;
   }
   
   public void setAmount(float amount) {
       this.amount = amount;
   }
   
   public float getAmount(){
       return this.amount;
   }
}


class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        SavingsAccount account = new SavingsAccount(name);
        System.out.println(account.name); 
        account.setAccNo(input.nextLong()); 
        System.out.println(account.getAccNo()); 
        account.setEmail(input.next());
        System.out.println(account.getEmail()); 
        account.setAmount(input.nextFloat()); 
        System.out.println(account.getAmount()); 
        input.close();
    } 
}
