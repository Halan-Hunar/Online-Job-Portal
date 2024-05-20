/**
 * JobApplication
 */
public class JobApplication {

    private int jobId;
    private int applicationId;
    private String applicationUsername;
    private String applicationStatus;

    public JobApplication(int jobId,int applicationId, String applicationUsername, String applicanStatus)
    {
        this.jobId=jobId;
        this.applicationId=applicationId;
        this.applicationUsername=applicationUsername;
        this.applicationStatus=applicanStatus;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public void setApplicationUsername(String applicationUsername) {
        this.applicationUsername = applicationUsername;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public int getJobId() {
        return jobId;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public String getApplicationUsername() {
        return applicationUsername;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    
    public String toString() {
        
        return "Job Application{"+
        "Job Id : "+jobId +
        "application Id:"+ applicationId+
        "Application Username: "+applicationUsername+
        "Application Status"+applicationStatus;

    }
}


