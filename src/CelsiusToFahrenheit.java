import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        float fahrenheit;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Temperature to Celsius");
        float celsius = scan.nextFloat();
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temp in Fahrenheit = "+fahrenheit+"F");
    }
}
