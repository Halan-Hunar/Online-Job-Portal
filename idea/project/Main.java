package idea.project;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create user accounts
        System.out.println();
        System.out.println("=== User Account Manager ===");
        UserAccountManager user1 = new UserAccountManager("Kurt_Cobain", "password123", "cobain@example.com", "Kurt", "Cobain");
        user1.registerUser("Kurt_Cobain", "password123", "cobain@example.com", "Kurt", "Cobain");
        user1.loginUser("Kurt_Cobain", "password123");
        System.out.println(user1);

        UserAccountManager user2 = new UserAccountManager("Freddie_Mercury", "password456", "freddie@example.com", "Freddie", "Mercury");
        user2.registerUser("Freddie_Mercury", "password456", "freddie@example.com", "Freddie", "Mercury");
        user2.loginUser("Freddie_Mercury", "password456");
        System.out.println(user2);

        // Update user profile
        user1.updateUserProfile("Kurt_Cobain", "newcobain@example.com", "Kurt", "Cobain");
        System.out.println(user1);

        // Create job listings
        System.out.println("=== Job Listing Manager ===");
        JobListingManager jobManager = new JobListingManager();
        jobManager.create("Software Engineer", "Develop software solutions", "Militech", "Night City", "100000");
        jobManager.create("Data Scientist", "Analyze data and build models", "Arasaka Corp", "Night City", "120000");

        // Get job details
        JobListing job1 = jobManager.getJobListingDetails(1);
        if (job1 != null) {
            System.out.println(job1);
        }

        JobListing job2 = jobManager.getJobListingDetails(2);
        if (job2 != null) {
            System.out.println(job2);
        }

        // Edit job listing
        jobManager.edit("Senior Software Engineer", "Develop advanced software solutions", "Militech", "Night City", "150000", "1");
        JobListing updatedJob1 = jobManager.getJobListingDetails(1);
        if (updatedJob1 != null) {
            System.out.println(updatedJob1);
        }

        // Create employer profiles
        System.out.println();
        System.out.println("=== Employer Profile Manager ===");
        EmployerProfileManager employerManager = new EmployerProfileManager();
        employerManager.create("Militech", "Leading Military tech company", "contact@militech.com", "1234567890");
        employerManager.create("Arasaka", "Corporate security, banking, and manufacturing company", "contact@Arasaka.com", "0987654321");

        System.out.println(employerManager);

        // Edit employer profile
        employerManager.edit("Militech", "Top-tier Military tech company", "contact@newmilitech.com", "1111111111");
        System.out.println(employerManager);

        // Admin operations
        System.out.println("=== Admin Panel ===");
        AdminPanel admin = new AdminPanel("admin", "adminpass123");
        admin.loginAdmin("admin", "adminpass123");

        // Add user accounts to admin for management
        admin.viewUserAccounts().add(user1);
        admin.viewUserAccounts().add(user2);

        // Add job listings to admin for management
        admin.viewJobListings().add(jobManager);

        // View and delete user accounts and job listings
        List<UserAccountManager> users = admin.viewUserAccounts();
        for (UserAccountManager user : users) {
            System.out.println(user);
        }

        List<JobListingManager> jobs = admin.viewJobListings();
        for (JobListingManager job : jobs) {
            JobListing jobDetail = job.getJobListingDetails(job.getJobId());
            if (jobDetail != null) {
                System.out.println(jobDetail);
            }
        }

        admin.deleteUserAccount("Kurt_Cobain");
        admin.deleteJobListing(1);

        // Final state
        System.out.println("=== Final State ===");
        users = admin.viewUserAccounts();
        for (UserAccountManager user : users) {
            System.out.println(user);
        }

        jobs = admin.viewJobListings();
        for (JobListingManager job : jobs) {
            JobListing jobDetail = job.getJobListingDetails(job.getJobId());
            if (jobDetail != null) {
                System.out.println(jobDetail);
            }
        }
    }
}