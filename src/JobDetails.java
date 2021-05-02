public class JobDetails {
    private String Title;
    private String Company;
    private String Location;
    private String Type;
    private String Level;
    private String YearsExp;
    private String Country;
    private String Skills;


    public JobDetails(String title, String company, String location, String type, String level, String yearsExp, String country, String skills) {
        this.Title = title;
        this.Company = company;
        this.Location = location;
        this.Type = type;
        this.Level = level;
        this.YearsExp = yearsExp;
        this.Country = country;
        this.Skills = skills;
    }
    @Override
    public String toString() {
        return "JobDetails{" + "title=" + Title + "," +
                " company=" + Company + "," +
                " location=" + Location + "," +
                " type=" + Type + "," +
                " level=" + Level + "," +
                " yearsExp=" + YearsExp + "," +
                " country=" + Country + "," +
                " skills=" + Skills + '}';
    }

    public String getTitle() {
        return Title;
    }

    public String getCountry() {
        return Country;
    }

    public String getLevel() {
        return Level;
    }

    public String getYearsExp() {
        return YearsExp;
    }
}
