import java.util.Scanner;
public class NumberOfDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Month");
        int month = scan.nextInt();
        System.out.println("Enter Year");
        int year = scan.nextInt();
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            System.out.print("Total days in the month is 31");
        else if((month == 2) && ((year%400==0) || (year%4==0 && year%100!=0)))
            System.out.print("Total days in the month is 29");
        else if(month == 2)
            System.out.print("Total days in the month is 28");
        else
            System.out.println("Total days in the month is 30");

    }
}
