package Core_java.Typecasting;

public class casting {
    public static void main(String[] args) {
        char bloodysweet='B';

        int myascinumber=bloodysweet;

        System.out.println("my blood is :"+bloodysweet+" convert a value ascinumber is :"+myascinumber);

        //narrowing-largest datatype to smallest datatype

        double myweight=59.78;
        int myholeweight=(int)myweight;
        System.out.println(myholeweight);

        long mobileno=9688193688L;

        int convertmobileno=(int) mobileno;

        System.out.println("my mobile number is "+mobileno+" is converted by integer"+convertmobileno);

        int mynumber=99;

        char value=(char)mynumber;
        System.out.println("my number is :"+mynumber+" is converted asni value is :"+value);

        int value1 = 10;
        System.out.println("The integer value: " + value1);

        // convert into double type
        double data = value1;
        System.out.println("The double value: " + data);

        double num1 = 10.99;
        System.out.println("The double value: " + num1);

        // convert into int type
        int data1 = (int)num1;
        System.out.println("The integer value: " + data);




    }
}
