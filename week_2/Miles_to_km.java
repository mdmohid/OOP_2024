import java.util.Scanner;
public class Miles_to_km{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double miles,kilometers;
        System.out.println("Enter miles:");
        miles=scan.nextDouble();
        kilometers = miles * 1.60935;
        System.out.println(miles+" miles is equal to "+kilometers+"km");
    }
}