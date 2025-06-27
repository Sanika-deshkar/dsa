import java.util.*;
public class Main {
    public static void Diamond(int n) {
     //1st half
   for (int i = 1; i <= n; i++) {  //for no. of lines
            for (int j = 1; j <= n - i; j++) {  //spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {   //stars
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {  //inverted
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Diamond(5);
    }
}
