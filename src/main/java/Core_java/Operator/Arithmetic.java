package Core_java.Operator;

public class Arithmetic {
    public void Arith()
    {
        int combo=150;
        int jumbo=200;
        int result=0;
        result=combo+jumbo;
        System.out.println("The value ADD is :"+result);
        result=jumbo-combo;
        System.out.println("The SUb is:"+result);
        result=jumbo*combo;
        System.out.println("The mul is :"+result);
        result=combo/jumbo;
        System.out.println("The Div isL"+result);
        result=combo%jumbo;
        System.out.println("The MOD is :"+result);


    }
    public static void main(String[] args) {
        Arithmetic AR=new Arithmetic();
        AR.Arith();





    }
}
