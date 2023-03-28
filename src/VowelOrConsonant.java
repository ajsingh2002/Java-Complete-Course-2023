import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Character");
        char ch = scan.next().charAt(0);
        if (ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
            System.out.println("Given Character is a Vowel");
        else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            System.out.println("Given Character is a Consonant");
        else
            System.out.println("Given Character is neither a Vowel nor a Consonant");
    }
}
