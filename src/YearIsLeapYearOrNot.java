import java.util.Scanner;
public class YearIsLeapYearOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = scan.nextInt();
        if(num%400==0)
            System.out.println("Is a leap year");
        else if(num%100==0)
            System.out.println("Not a leap year");
        else if(num%4==0)
            System.out.println("Is a leap year");
        else
            System.out.println("Not a leap year");

    }
}
