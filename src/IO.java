import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IO {
    public IO() {}
    public List<JobDetails> ReadCSVFile(String fileName){
        List<JobDetails> Jobs = new ArrayList<>();
        // create an instance of BufferedReader

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // read the first line from the text file which will be head column
            String line;
            line=br.readLine();

            // read first line
            if (line != null) {
                line = br.readLine(); // the first real data
            }
            // loop until all lines are read
            while (line != null) {
                // use string.split to load a string array with the values from each line of the file, using a comma as the delimiter
                String[] metadata = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", 8);

                // createJob() retrieved attribute"
                // adding Job into ArrayList
                Jobs.add(createJob(metadata));

                // read next line before looping
                line = br.readLine();
                // if end of file reached, line would be null

            }
        }
        catch (IOException ioe) {
            ioe.printStackTrace();

        }

        return Jobs;

    }
    public JobDetails createJob(String[] metadata) {

        String title    = metadata[0];
        String company  = metadata[1];
        String location = metadata[2];
        String type     = metadata[3];
        String level    = metadata[4];
        String yearsExp = metadata[5];
        String country  = metadata[6];
        String skills   = metadata[7];


        // create and return Job of this metadata
        return new JobDetails(title, company, location, type,
                            level, yearsExp, country, skills);


    }
}
