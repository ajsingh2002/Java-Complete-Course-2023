import java.util.Scanner;
public class NumberIsEvenOrOdd {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        num = scan.nextInt();
        if (num%2==0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");

    }
}
