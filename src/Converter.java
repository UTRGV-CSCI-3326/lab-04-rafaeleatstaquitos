import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
        System.out.println("Welcome to Feet-to-Yards Lenght Converter!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a lenght in feet: ");
        float feet = input.nextFloat();
        input.close();
        System.out.println();
        float yards = feet / 3;
        System.out.printf("%.1f feet is %.2f yards%n", feet, yards);
        System.out.println();
    }
}
