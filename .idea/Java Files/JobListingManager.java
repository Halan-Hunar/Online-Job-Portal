class JobListingManager {
  private int jobId;
  private String jobTitle;
  private String jobDescription;
  private String companyName;
  private String location;
  private double salary;

  //contructor
  public JobListingManager() {
    this.jobId = 0;
    this.jobTitle = "";
    this.jobDescription = "";
    this.companyName = "";
    this.location = "";
    this.salary = 0.0;
  }

// create job new job lisitng
  public boolean createJobListing(String jobTitle, String jobDescription, String companyName, String location, double salary) {
    this.jobTitle = jobTitle;
    this.jobDescription = jobDescription;
    this.companyName = companyName;
    this.location = location;
    this.salary = salary;

    this.jobId++;

    System.out.println("Job listing created successfully");
    return true;
  }

  //edits job
  public boolean editJobListing(String jobTitle, String jobDescription, String companyName, String location, double salary) {
    if(this.jobId == jobId){
      this.jobTitle = jobTitle;
      this.jobDescription = jobDescription;
      this.companyName = companyName;
      this.location = location;
      this.salary = salary;

      System.out.println("Job listing edited successfully");
      return true;
    }
    else {
      System.out.println("Job listing with " + jobId + " does not exist");
      return false;
    }
  }

  //deletes
  public boolean deleteJobListing(int jobId){
    if(this.jobId == jobId){
      this.jobId = 0;
      this.jobTitle = "";
      this.jobDescription = "";
      this.companyName = "";
      this.location = "";
      this.salary = 0.0;

      System.out.println("Job listing deleted successfully");
      return true;
    }
    else {
      System.out.println("Job listing with " + jobId + " does not exist");
      return false;
    }
  }

  //this will get details of a specific job in the JobListing class

  public JobListing getJobListingDetails(int jobId){
    if(this.jobId == jobId){
      return new JobListing(this.jobId, this.jobTitle, this.jobDescription, this.companyName, this.location, this.salary);
    }
    else {
      System.out.println("Job listing with " + jobId + " does not exist");
      return null;
    }
  }
}