import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class calender {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the Year!");
        int year = input.nextInt();

        System.out.println("Please Enter the Month!");
        int month = input.nextInt();

        LocalDate firstDayofMonth = LocalDate.of(year,month,1);
        int DaysinMonth = firstDayofMonth.lengthOfMonth();
        DayOfWeek firstDayOfWeek = firstDayofMonth.getDayOfWeek();
        int valueOfWeek = firstDayOfWeek.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        for (int i = 1; i < valueOfWeek; i++) {
            System.out.print("    ");
        }

        for (int i = 1; i <= DaysinMonth; i++) {
            System.out.printf("%3d",i);
            if ((i + valueOfWeek - 1) %7 == 0) {
                System.out.println();
            }
        }

        input.close();
    }
}