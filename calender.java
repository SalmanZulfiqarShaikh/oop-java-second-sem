import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;
public class calender {
    

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Year");
        int year = input.nextInt();
        System.out.println("Please Enter Month (1-12)");
        int month = input.nextInt();


        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        DayOfWeek dayOfWeek = firstDayOfMonth.getDayOfWeek();
        int value = dayOfWeek.getValue(); // 1=Monday, 7=Sunday
        int daysInMonth = firstDayOfMonth.lengthOfMonth();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("   ");
        }
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + value - 1) % 7 == 0) {
                System.out.println();
            }
        }
        input.close();
    }
}
