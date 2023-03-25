import java.util.Scanner;
public class AlphabetOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Alphabet");
        char alp = scan.next().charAt(0);
        if((alp>='A' && alp<= 'Z') || (alp>='a' && alp<='z'))
            System.out.println(alp+" is an alphabet");
        else
            System.out.println(alp+" is not an alphabet");
    }
}
