import java.util.Scanner;
public class EquilateralIsoscelesOrScaleneTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the X value");
        int x = scan.nextInt();
        System.out.println("Enter the Y value");
        int y = scan.nextInt();
        System.out.println("Enter the Z value");
        int z = scan.nextInt();
        if (x==y && y==z)
            System.out.println("Equilateral Triangle");
        else if(x!=y && y!=z && z!=x)
            System.out.println("Scalene Triangle");
        else
            System.out.println("Isosceles Triangle");

    }
}
