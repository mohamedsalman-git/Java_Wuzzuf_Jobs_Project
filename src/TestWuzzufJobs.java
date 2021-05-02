import java.util.List;

public class TestWuzzufJobs {
     public static void test(){
         IO iocsv = new IO();
         List<JobDetails> jobs = iocsv.ReadCSVFile("Wuzzuf_Jobs.csv");
         JobsDataService JDS=new JobsDataService();

         JDS.FilterJobsByTitle(jobs);
         System.out.println();

         JDS.FilterJobsByCountry(jobs);
         System.out.println();

         JDS.FilterJobsByLevel(jobs);
         System.out.println();

         JDS.FilterJobsByYearsExp(jobs);

     }

    public static void main(String[] args) {
        test();
    }
}
    //English Teacher / Primary Stages	Modern American School of Egypt 2000	 New Cairo	Full Time	Experienced	3-7 Yrs of Exp	Cairo	English Teacher, Upper Primary, Education, Teaching, Communication Skills, Education/Teaching
