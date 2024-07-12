package Core_java.conditionalstmts;

import java.util.Scanner;

public class ifelsenew {
    public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);
        System.out.println("Enter the Frndname");
       // int age = 0;
        String cname=ss.next();
        if(cname.equalsIgnoreCase("Gowthami"))
        {
           // System.out.println(age1);
            System.out.println("You got the Friendname");
        }
        else {
            System.out.println("Not Eligible ");
        }

    }
}
