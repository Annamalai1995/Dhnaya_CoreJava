package Core_java.OOPS;
class bank
{
    public  void Transaction()
    {
        String Accountname="DhanyaSree";
        int AccoutId=124455;
        System.out.println("ACCOUNTNAME IS:"+Accountname);
        System.out.println("ACCOUNTID:"+AccoutId);
    }
}

class CustomerDetails extends bank
{
    public  void Details()
    {
        String Bankname="HDFCBANK";
        String Branch="Fairlands";
        System.out.println("BANKNAME IS :"+Bankname);
        System.out.println("BRANCHNAME IS:"+Branch);
    }

}

public class single {
    public static void main(String[] args) {
        CustomerDetails cd= new CustomerDetails();
        cd.Transaction();
        cd.Details();

    }
}
