/*
define variables
prompt user for a number
create a for loop (   for(i=0,i<=number; i++)    )
print number
\t to create a space for next number
multiply i by i
 */

import sun.jvm.hotspot.runtime.bsd_amd64.BsdAMD64JavaThreadPDAccess;
import java.util.Scanner;
public class Squares {
    public static void main (String[] args) {
        Scanner keybd = new Scanner(System.in);
        int number;
        int square;
        System.out.print("Enter a number: ");
        number = keybd.nextInt();
        keybd.nextLine();
        System.out.println("Number\t\tSquare\n------\t\t------");
        for (int i = 1; i <= number; i++) {
            square = i * i;
            System.out.printf("%d\t\t\t%d\n", i, square);

        }
    }
}

