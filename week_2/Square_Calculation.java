import java.util.Scanner;
public class Square_Calculation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int l1,perimeter,area;
        System.out.println("Enter the length of square's side:");
        l1 = scan.nextInt();
        perimeter = 4*l1;
        area = l1*l1;
        System.out.println("The perimeter of square is " + perimeter);
        System.out.println("The area of square is " + area);

    }
    
}
