import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AddYears{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String date = input.nextLine();
        int num = input.nextInt();
        
        DateTimeFormatter Date = DateTimeFormatter.ofPattern("MMM dd yyyy");
        LocalDate dateFormat = LocalDate.parse(date, Date);
        LocalDate addYear = dateFormat.plusYears(num);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = addYear.format(formatter);
        System.out.println(formattedDate);
    }
}
