import java.util.Scanner;
public class PositiveOrNegativeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = scan.nextInt();
        if (num>0)
            System.out.println("Number is Positive");
        else if(num==0)
            System.out.println("Number is Zero");
        else
            System.out.println("Number is Negative");

    }
}
