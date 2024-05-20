import java.util.List;

 public class AdminPanel {
    private String adminUsername;
     private String adminPassword;

    
     public AdminPanel(String adminUsername, String adminPassword) {
        this.adminUsername= adminUsername;
         this.adminPassword= adminPassword;
     }

public boolean loginAdmin(String username, String password) {
     return this.adminUsername.equals(username) && this.adminPassword.equals(password);
   }

   public List<UserAccount> viewUserAccounts(UserAccountManager userAccountManager) {
         return userAccountManager.getAllUserAccounts();
     }

   public List<JobListing> viewJobListings(JobListingManager jobListingManager) {
         return jobListingManager.getAllJobListings();
     }

     public boolean deleteJobListing(JobListingManager jobListingManager, int jobId) {
         return jobListingManager.deleteJobListing(jobId);
     }

   public boolean deleteUserAccount(UserAccountManager userAccountManager, String username) {
      return userAccountManager.deleteUser(username);
  }

    public String getAdminUsername() {
         return adminUsername;
    }

   public void setAdminUsername(String adminUsername) {
       this.adminUsername =adminUsername;
     }

       public String getAdminPassword() {
        return adminPassword;
        }

     public void setAdminPassword(String adminPassword) {
        this.adminPassword= adminPassword;
      }
}