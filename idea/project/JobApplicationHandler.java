package idea.project; /**
 * JobApplicationHandler
 */

 import java.util.ArrayList;

public class JobApplicationHandler {

    //Class Attributes
    private ArrayList<JobApplication> jobApplications;
    

    //Class Constructor
    public JobApplicationHandler()
    {
        this.jobApplications= new ArrayList<JobApplication>();
    }

    //applyForJob Method
    public boolean applyForJob(int jobId, String applicantUsername)
    {
        for(JobApplication application : jobApplications)
        {
            if(application.getJobId()==jobId && application.getApplicantUsername()==applicantUsername)
            {
                System.out.println("You have already applied for this job.");
                return false;
            }

        }

        JobApplication tempApplication = new JobApplication(jobApplications.size()+1, jobId, applicantUsername,"pending");
        jobApplications.add(tempApplication);
        System.out.println("Application Submitted Successfully!");
        return true;
    } 

    //getJobApplications Method
    public ArrayList<JobApplication> geJobApplications(int jobId)
    {
       ArrayList<JobApplication> ApplicationsForJob= new ArrayList<JobApplication>();
       
       for(JobApplication application : jobApplications)
       {
        if(application.getJobId()==jobId)
        {
            ApplicationsForJob.add(application);
        }
       }

       return ApplicationsForJob;
    }

    //updateApplicatinStatus method
    public boolean updateApplicatinStatus(int applicationId, String newStatus)
    {
        for(JobApplication application : jobApplications)
        {
            if(application.getApplicationId()==applicationId)
            {
                application.setApplicationStatus(newStatus);
                System.out.println("Application Updated Successfully! ");
                return true;
            }

        }
        System.out.println("Application not Found! ");
        return false;
    }

    //to display the list
    public void displayAllApplications() {
        for (JobApplication application : jobApplications) {
            System.out.println(application);
        }
    }
}