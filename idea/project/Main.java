package idea.project;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdminPanel adminPanel = new AdminPanel("admin", "admin123");
        JobListingManager jobListingManager = new JobListingManager();
        UserAccountManager userAccountManager = new UserAccountManager("", "", "", "", "");
        JobApplicationHandler jobApplicationHandler = new JobApplicationHandler();
        EmployerProfileManager employerProfileManager = new EmployerProfileManager();
        FeedbackSystem feedbackSystem = new FeedbackSystem();

        while (true) {
            System.out.println("Welcome to the Online Job Portal System!");
            System.out.println("1. Register as a new user");
            System.out.println("2. Login as an existing user");
            System.out.println("3. Admin login");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    // Register as a new user
                    System.out.print("Enter username: ");
                    String newUsername = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String newPassword = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String newEmail = scanner.nextLine();
                    System.out.print("Enter first name: ");
                    String newFirstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String newLastName = scanner.nextLine();
                    userAccountManager.registerUser(newUsername, newPassword, newEmail, newFirstName, newLastName);
                    break;
                case 2:
                    // Login as an existing user
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    if (userAccountManager.loginUser(username, password)) {
                        userMenu(scanner, userAccountManager, jobListingManager, jobApplicationHandler, feedbackSystem, username);
                    }
                    break;
                case 3:
                    // Admin login
                    System.out.print("Enter admin username: ");
                    String adminUsername = scanner.nextLine();
                    System.out.print("Enter admin password: ");
                    String adminPassword = scanner.nextLine();
                    if (adminPanel.loginAdmin(adminUsername, adminPassword)) {
                        adminMenu(scanner, adminPanel, userAccountManager, jobListingManager);
                    }
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void userMenu(Scanner scanner, UserAccountManager userAccountManager, JobListingManager jobListingManager, JobApplicationHandler jobApplicationHandler, FeedbackSystem feedbackSystem, String username) {
        while (true) {
            System.out.println("User Menu");
            System.out.println("1. Apply for a job");
            System.out.println("2. Update profile");
            System.out.println("3. Submit feedback");
            System.out.println("4. View feedback");
            System.out.println("5. Logout");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    // Apply for a job
                    System.out.print("Enter job ID: ");
                    int jobId = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    jobApplicationHandler.applyForJob(jobId, username);
                    break;
                case 2:
                    // Update profile
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();
                    userAccountManager.updateUserProfile(username, email, firstName, lastName);
                    break;
                case 3:
                    // Submit feedback
                    System.out.print("Enter feedback message: ");
                    String feedbackMessage = scanner.nextLine();
                    feedbackSystem.submitFeedback(username, feedbackMessage);
                    break;
                case 4:
                    // View feedback
                    List<FeedbackSystem.Feedback> feedbackList = feedbackSystem.viewFeedback(username);
                    for (FeedbackSystem.Feedback feedback : feedbackList) {
                        System.out.println(feedback);
                    }
                    break;
                case 5:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void adminMenu(Scanner scanner, AdminPanel adminPanel, UserAccountManager userAccountManager, JobListingManager jobListingManager) {
        while (true) {
            System.out.println("Admin Menu");
            System.out.println("1. View user accounts");
            System.out.println("2. View job listings");
            System.out.println("3. Delete user account");
            System.out.println("4. Delete job listing");
            System.out.println("5. Logout");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    // View user accounts
                    adminPanel.displayAllUserAccounts();
                    break;
                case 2:
                    // View job listings
                    adminPanel.displayAllJobListings();
                    break;
                case 3:
                    // Delete user account
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    adminPanel.deleteUserAccount(username);
                    break;
                case 4:
                    // Delete job listing
                    System.out.print("Enter job ID: ");
                    int jobId = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    adminPanel.deleteJobListing(jobId);
                    break;
                case 5:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
