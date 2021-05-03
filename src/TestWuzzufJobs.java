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
