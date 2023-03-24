import java.util.Scanner;

public class NumberIsDivisible {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        num = scan.nextInt();
        if(num%3==0){
            System.out.println("Number is Divisible by 3");
        }
        else{
            System.out.println("Number is Not Divisible by 3");

        }
    }
}
