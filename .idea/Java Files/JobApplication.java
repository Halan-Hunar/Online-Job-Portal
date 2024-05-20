/**
 * JobApplication
 */
public class JobApplication {
//class attributes
    private int jobId;
    private int applicationId;
    private String applicantUsername;
    private String applicationStatus;

    //consturctor
    public JobApplication(int jobId,int applicationId, String applicationUsername, String applicanStatus)
    {
        this.jobId=jobId;
        this.applicationId=applicationId;
        this.applicantUsername=applicationUsername;
        this.applicationStatus=applicanStatus;
    }

    //setters
    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public void setApplicationUsername(String applicationUsername) {
        this.applicantUsername = applicationUsername;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }


    //getters

    public int getJobId() {
        return jobId;
    }

    public int getApplicationId() {
        return applicationId;
    }


    public String getApplicantUsername() {
        return applicantUsername;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    //to string method
    public String toString() {
        
        return "Job Application{"+
        "Job Id : "+jobId +
        "application Id:"+ applicationId+
        "Applicant Username: "+applicantUsername+
        "Application Status"+applicationStatus;

    }
}


