package idea.project;

import java.util.ArrayList;
import java.util.List;

public class AdminPanel {

  private String adminUsername;
  private String adminPassword;
  private List<UserAccountManager> userAccounts;
  private List<JobListingManager> jobListings;

  public AdminPanel(String adminUsername, String adminPassword) {
    this.adminUsername = adminUsername;
    this.adminPassword= adminPassword;
    this.userAccounts= new ArrayList<>();
    this.jobListings =new ArrayList<>();
  }

  public boolean loginAdmin(String username, String password) {
    if (this.adminUsername.equals(username) && this.adminPassword.equals(password)) {
      System.out.println("Admin logged in successfully");
      return true;
    } else  {
      System.out.println("Incorrect admin username or password");
      return false;
    }
  }

  public List<UserAccountManager> viewUserAccounts() {
    return new ArrayList<>(this.userAccounts);
  }

  public List<JobListingManager> viewJobListings() {
    return new ArrayList<>(this.jobListings);
  }

  public boolean deleteJobListing(int jobId) {
    for (JobListingManager jobListing : jobListings) {
      if (jobListing.getJobListingDetails(jobId) != null) {
        jobListings.remove(jobListing);
        System.out.println("Job listing deleted successfully");
        return true;
      }
    }
    System.out.println("Job listing with ID " + jobId + " does not exist");
    return false;
  }

  public boolean deleteUserAccount(String username) {
    for (UserAccountManager userAccount : userAccounts) {
      if (userAccount.toString().contains("User Name: " + username)) {
        userAccounts.remove(userAccount);
        System.out.println("User account deleted successfully");
        return true;
      }
    }
    System.out.println("User account with username " + username + " does not exist");
    return false;
  }

  public void addUserAccount(UserAccountManager userAccount) {
    this.userAccounts.add(userAccount);
  }

  public void addJobListing(JobListingManager jobListing) {
    this.jobListings.add(jobListing);
  }

  public void displayAllUserAccounts() {
    for (UserAccountManager userAccount : userAccounts) {
      System.out.println(userAccount);
    }
  }

  public void displayAllJobListings() {
    for (JobListingManager jobListing : jobListings) {
      System.out.println(jobListing);
    }
  }
}