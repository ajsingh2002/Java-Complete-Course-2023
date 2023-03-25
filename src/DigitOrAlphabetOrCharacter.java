import java.util.Scanner;
public class DigitOrAlphabetOrCharacter {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a Input");
        char ch = scan.next().charAt(0);
        if(ch>'0' && ch<='9')
            System.out.println("It is Digit");
        else if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
            System.out.println("It is Alphabet");
        else
            System.out.println("It is Character");
    }
}
