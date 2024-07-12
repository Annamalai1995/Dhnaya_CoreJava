package Core_java.OOPS;

class father
{
    String fname="Sundaramoorthy";
    public void Mother() {
        String Mname="Jayanthi";
        System.out.println("Mother Name is:"+Mname);
        System.out.println("Father Name is :"+fname);
    }

}

class Brother extends father
{
    public void brother()
    {
        String SNAME="Annamalai";
        System.out.println("Brother Name is :"+SNAME);
    }
}
class Annamalai extends  father
{
    public  void Lname()
    {
        String Lname="Gowthami";
        System.out.println(" Friend name is :"+Lname);
    }

    public static void main(String[] args) {
        Annamalai aa= new Annamalai();
        aa.Lname();
        aa.Mother();

        Brother bb = new Brother();
        bb.brother();

    }



}

