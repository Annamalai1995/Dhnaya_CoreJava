package Core_java.OOPS.Multilevel;
class bank
{
    public void transaction()
    {
        long accNo=12457896662l;
        String Accholder="DhanyaSree";
        String AccSatus="Active";
        System.out.println("Account Number:"+accNo);
        System.out.println("Account status:"+AccSatus);
        System.out.println("Accontholder:"+Accholder);
    }
}
class customer extends  bank{
    public  void Balance()
    {
        int amount=150000;
        int amt=50000;
        int result=amount+amt;
        System.out.println("Available Balance is:"+result);
    }
}
class Transaction extends customer
{
    public  void Details()
    {
        String Bankname="HDFC BANK";
        String Branch_name="Ammapet";
        System.out.println("Bank name is:"+Bankname);
        System.out.println("Branch Name is :"+Branch_name);
    }
}
public class Multilevel {
    public static void main(String[] args) {
        customer cc = new customer();
        cc.Balance();
        cc.transaction();

        Transaction tt= new Transaction();
        tt.transaction();
        tt.Balance();
        tt.Details();
    }
}
