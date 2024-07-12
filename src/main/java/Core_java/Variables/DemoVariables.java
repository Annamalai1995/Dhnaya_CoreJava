package Core_java.Variables;

public class DemoVariables {
    //Static varibles
    static  String favorite_place="Yercaud";
    //Global variables
    String college="Sona COllege of Technology";
    String Location="salem";


//Local Variables
    public void Dhanya()    //Method created
    {
        String type="Tandoori Sharwama";
        int price=250;
        System.out.println("The Type is:"+type);
        System.out.println("The price is :"+price);
        System.out.println("The college Is:"+college);
        System.out.println("The Lcoation is:"+Location);
        System.out.println("The Favorite place:"+favorite_place);

    }

    public static void main(String[] args) {
        int price=150;    //Instance Variables
        String name="Mexican Sharwarma";
        System.out.println("The Sharwarma Price is :"+price);
        System.out.println("Sharwarma Name is:"+name);
        System.out.println("The Favorite place:"+favorite_place);

        //Object Created
        DemoVariables dv=new DemoVariables();   //classname objectname=new classname();
        dv.Dhanya();
    }
}
