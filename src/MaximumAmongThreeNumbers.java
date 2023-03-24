import java.util.Scanner;
public class MaximumAmongThreeNumbers {
    public static void main(String[] args) {
        int num1,num2,num3,largest;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the First Numbers : ");
        num1 = scan.nextInt();
        System.out.println("Enter the Second Numbers : ");
        num2 = scan.nextInt();
        System.out.println("Enter the Third Numbers : ");
        num3 = scan.nextInt();
        if(num1>num2 && num1>num3)
            largest = num1;
        else if(num2>num1 && num2>num3)
            largest = num2;
        else
            largest = num3;
        System.out.println("Largest Number Among Three = " +largest);
    }
}
