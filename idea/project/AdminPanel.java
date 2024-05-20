package idea.project;

import java.util.ArrayList;
import java.util.List;

public class AdminPanel {

    private String adminUsername;
    private String adminPassword;
    private List<UserAccountManager> userAccounts;
    private List<JobListingManager> jobListings;

    // Constructor
    public AdminPanel(String adminUsername, String adminPassword) {
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
        this.userAccounts = new ArrayList<>();
        this.jobListings = new ArrayList<>();
    }

    // Method to login as admin
    public boolean loginAdmin(String username, String password) {
        if (this.adminUsername.equals(username) && this.adminPassword.equals(password)) {
            System.out.println("Admin logged in successfully");
            return true;
        } else {
            System.out.println("Incorrect admin username or password");
            return false;
        }
    }

    // Method to view all user accounts
    public List<UserAccountManager> viewUserAccounts() {
        return new ArrayList<>(this.userAccounts); // Return a copy of the list to avoid direct modification
    }

    // Method to view all job listings
    public List<JobListingManager> viewJobListings() {
        return new ArrayList<>(this.jobListings); // Return a copy of the list to avoid direct modification
    }

    // Method to delete a job listing by jobId
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

    // Method to delete a user account by username
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

    // Method to add a user account (for testing purposes)
    public void addUserAccount(UserAccountManager userAccount) {
        this.userAccounts.add(userAccount);
    }

    // Method to add a job listing (for testing purposes)
    public void addJobListing(JobListingManager jobListing) {
        this.jobListings.add(jobListing);
    }

    // Method to display all user accounts (for testing purposes)
    public void displayAllUserAccounts() {
        for (UserAccountManager userAccount : userAccounts) {
            System.out.println(userAccount);
        }
    }

    // Method to display all job listings (for testing purposes)
    public void displayAllJobListings() {
        for (JobListingManager jobListing : jobListings) {
            System.out.println(jobListing);
        }
    }
}
