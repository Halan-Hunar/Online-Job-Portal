package idea.project;

class JobListingManager extends JobPortalManager implements Manageable {
    private int jobId;
    private String jobTitle;
    private String jobDescription;
    private String companyName;
    private String location;
    private double salary;

    // constructor
    public JobListingManager() {
        this.jobId = 0;
        this.jobTitle = "";
        this.jobDescription = "";
        this.companyName = "";
        this.location = "";
        this.salary = 0.0;
    }

    @Override
    public boolean create(String... details) {
        this.jobTitle = details[0];
        this.jobDescription = details[1];
        this.companyName = details[2];
        this.location = details[3];
        this.salary = Double.parseDouble(details[4]);

        this.jobId++;

        System.out.println("Job listing created successfully");
        return true;
    }

    @Override
    public boolean edit(String... details) {
        if (this.jobId == Integer.parseInt(details[5])) {
            this.jobTitle = details[0];
            this.jobDescription = details[1];
            this.companyName = details[2];
            this.location = details[3];
            this.salary = Double.parseDouble(details[4]);

            System.out.println("Job listing edited successfully");
            return true;
        } else {
            System.out.println("Job listing with " + jobId + " does not exist");
            return false;
        }
    }

    @Override
    public boolean delete(int jobId) {
        if (this.jobId == jobId) {
            this.jobId = 0;
            this.jobTitle = "";
            this.jobDescription = "";
            this.companyName = "";
            this.location = "";
            this.salary = 0.0;

            System.out.println("Job listing deleted successfully");
            return true;
        } else {
            System.out.println("Job listing with " + jobId + " does not exist");
            return false;
        }
    }

    // this will get details of a specific job in the JobListing class
    public JobListing getJobListingDetails(int jobId) {
        if (this.jobId == jobId) {
            return new JobListing(this.jobId, this.jobTitle, this.jobDescription, this.companyName, this.location, this.salary);
        } else {
            System.out.println("Job listing with " + jobId + " does not exist");
            return null;
        }
    }
}