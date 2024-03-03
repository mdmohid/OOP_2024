import java.util.Scanner;
public class Fraction {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numerator,denominator;
        double decimalEquivalent;
        System.out.println("Enter the numerator:");
        numerator = scan.nextInt();
        System.out.println("Enter the denominator:");
        denominator = scan.nextInt();
        decimalEquivalent = numerator/denominator;
        System.out.println("The decimal equivalent of the fraction is " + decimalEquivalent);

    }
    
}
