package console;

import java.io.IOException;

public interface StudentdetailsFunctions {
    public String Newstudentdetails(Studentdetails studentinfo);
    public void Listallstudentdetails();
    public void Updatestudentdetails(int student_regno);
    public void Deletestudentdetails(int student_regno) throws IOException, ClassNotFoundException;
    public void  FindIndex(long mobile_no);
    public  void Sortstudentdetails();
}
