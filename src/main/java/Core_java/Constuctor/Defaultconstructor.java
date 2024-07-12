package Constuctor;

public class Defaultconstructor {
    public void details()
    {
        System.out.println("customer details");
    }
    //Default
    public  Defaultconstructor()
    {
        System.out.println("Annamalai");
    }

    public static void main(String[] args) {
        Defaultconstructor dd=new Defaultconstructor();
        dd.details();
        
    }
}
