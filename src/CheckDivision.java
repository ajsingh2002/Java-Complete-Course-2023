import java.util.*;
public class CheckDivision  {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter marks");
        int marks = scan.nextInt();
        int per = marks/5;
        if (per>=60)
            System.out.println("Division 1 ");
        else if(per>=45 && per<60)
            System.out.println("Division 2 ");
        else if(per>=30 && per <45)
            System.out.println("Division 3");
        else
            System.out.println("Fail");
    }
}
/*
total no = 500
number = 461

percentage = (461/500)*100;
if(percentage >= 60){
sout("division one");
sout("percenteage is "+pecentage+"%");
}
sout()
 */