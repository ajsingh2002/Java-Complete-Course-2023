import java.util.Scanner;
public class ValidForVoteOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        if (age>18)
            System.out.println("Eligible for Vote");
        else
            System.out.println("Not Eligible for Vote");
    }
}
