import java.util.Scanner;
public class DigitOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Digit");
        char num = scan.next().charAt(0);
        if (num>'0' && num<='9')
            System.out.println("It is Digit");
        else
            System.out.println("Not a Digit");
    }
}
