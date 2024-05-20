package idea.project;

class JobListing {
  private int jobId;
  private String jobTitle;
  private String jobDescription;
  private String companyName;
  private String location;
  private double salary;

  public JobListing(int jobId, String jobTitle, String jobDescription, String companyName, String location, double salary){
    this.jobId = jobId;
    this.jobTitle = jobTitle;
    this.jobDescription = jobDescription;
    this.companyName = companyName;
    this.location = location;
    this.salary = salary;
  }

  public int getJobId() { return jobId; }

  public String getJobTitle() { return jobTitle; }

  public String getJobDescription() { return jobDescription;}

  public String getCompanyName() { return companyName; }

  public String getLocation() { return location; }

  public double getSalary() { return salary; }

  public void setJobId(int jobId) { this.jobId = jobId; }

  public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }

  public void setJobDescription(String jobDescription) { this.jobDescription = jobDescription; }

  public void setCompanyName(String companyName) { this.companyName = companyName; }

  public void setLocation(String location) { this.location = location; }

  public void setSalary(double salary) { this.salary = salary; }
}