package console;

import java.io.IOException;

public class StudentdetailsMain
{
    public static void main(String[] args)  throws IOException
    {
         CollectionStudentBio bio=new CollectionStudentBio();


       Thread th1=new Thread(bio,"Annamalai");
       th1.getName();
        System.out.println(th1);
       // Thread th2=new Thread(bio,"priya");
        //Thread th3=new Thread(bio,"Raja");

        th1.start();
        //th2.start();
        //th3.start();
    }
}