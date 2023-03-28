import java.util.Scanner;
public class UppercaseOrLowercase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Check character is uppercase or lowercase.");
        char ch = scan.next().charAt(0);
        if(ch>='A' && ch<='Z')
            System.out.println("Character is Uppercase");
        else if(ch>='a' && ch<='z')
            System.out.println("Character is Lowercase");
        else
            System.out.println("Not a Character");
    }
}
