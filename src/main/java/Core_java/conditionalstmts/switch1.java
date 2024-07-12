package Core_java.conditionalstmts;
import java.util.Scanner;
public class switch1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //System.out.println("tell us your favoriate week days");

        //String day=scan.nextLine();

       /* switch (day)
        {
            case "sunday" :
                System.out.println("Sunday is Holiday and Rest Day");
                break;
            case "monday":
                System.out.println("Monday is Week Working day is start");
                break;
            case "saturday":
                System.out.println("Saturday is week end of the day");
                break;
            default:
                System.out.println(day+" in the day is full working day-Any field");
        }*/
        System.out.println("please enter the vowels letters only");
        String vowels=scan.next();
        switch (vowels)
        {
            case "a":
                System.out.println("A is vowels");
                break;
            case "e":
                System.out.println("E is vowels");
                break;
            case  "i":
                System.out.println("I is vowels");
                break;
            case  "o":
                System.out.println("O is vowels");
                break;
            case "u":
                System.out.println("U is vowels");
                break;
            default:
                System.out.println("Not valid");


        }


    }
}
