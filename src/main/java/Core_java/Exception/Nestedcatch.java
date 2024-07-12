package Core_java.Exception;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Nestedcatch {
    public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);
            int alpha=0;
            int beta=0;
            try
            {
                System.out.println("enter the first number");
                alpha=scan.nextInt();
                System.out.println("enter the second number");
                beta=scan.nextInt();
                System.out.println(alpha/beta);
            }
            catch(ArithmeticException exe)
            {
                System.out.println("Division  by zero");
                alpha=scan.nextInt();
                System.out.println(alpha/beta);
            }
            catch(InputMismatchException exe1)
            {
                Scanner scans=new Scanner(System.in);
                System.out.println("only used by numeric numbers");
                alpha=scans.nextInt();
                beta=scans.nextInt();
                System.out.println(alpha/beta);
            }
        }




}
