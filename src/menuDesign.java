import java.util.Scanner;
public class menuDesign {
    public static void main(String[] args) {
        Scanner draw = new Scanner(System.in);
        short choose, n;
        System.out.println("Enter choose of you: ");
        choose = draw.nextShort();
        if( choose > 0 && choose <= 3) {
            System.out.println("Enter the width: ");
            n = draw.nextShort();
            if( choose == 1) {
                System.out.println("Draw the triangle: ");
                for( short i = 0; i < n; i++) {
                    System.out.println(" ");
                    for( short j = 0; j < n - i; j++) {
                        System.out.print("* ");
                    }
                }
            } else if( choose == 2) {
                System.out.println("Draw the square: ");
                for( short i = 0; i < n; i++) {
                    System.out.println(" ");
                    for( short j = 0; j < n; j++) {
                        System.out.print("*  ");
                    }
                }
            } else {
                System.out.println("Draw the rectangle: ");
                for( short i = 0; i < n; i++) {
                    System.out.println(" ");
                    for (short j = 0; j < n * 2; j++) {
                        System.out.print("* ");
                    }
                }
            }
        } else {
            System.out.print("No choice!");
        }
    }
}