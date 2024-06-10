package idea.project;

public class UserAccountManager extends Person {

  public UserAccountManager(String username, String password, String email, String firstName, String lastName) {
    super(username, password, email, firstName, lastName);
  }

  // creates a user by initializing attributes and stores them
  public boolean registerUser(String username, String password, String email, String firstName, String lastName) {
    this.username = username;
    this.password = password;
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
    System.out.println("User registered successfully");
    return true;
  }

  // logs in existing user and also checks if user already exists or not
  public boolean loginUser(String username, String password) {
    if (this.username.equals(username) && this.password.equals(password)) {
      System.out.println("User logged in successfully");
      return true;
    } else {
      System.out.println("Incorrect username or password");
      return false;
    }
  }

  // information user update by comparing the provided username with the stored one
  public boolean updateUserProfile(String username, String email, String firstName, String lastName) {
    if (this.username.equals(username)) {
      this.email = email;
      this.firstName = firstName;
      this.lastName = lastName;
      System.out.println("Profile updated successfully");
      return true;
    } else {
      System.out.println("Profile update failed");
      return false;
    }
  }

  // deletes user
  public boolean deleteUser(String username) {
    if (this.username.equals(username)) {
      this.username = null;
      this.password = null;
      this.email = null;
      this.firstName = null;
      this.lastName = null;
      System.out.println("User deleted successfully");
      return true;
    } else {
      System.out.println("User deletion failed");
      return false;
    }
  }

  // displays account details
  public String toString() {
    return "Account Details: \n" +
            "User Name: " + username + "\n" +
            "Email: " + email + "\n" +
            "First Name: " + firstName + "\n" +
            "Last Name: " + lastName + "\n";
  }
}