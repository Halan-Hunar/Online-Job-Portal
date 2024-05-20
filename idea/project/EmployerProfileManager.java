package idea.project;

class EmployerProfileManager {
  private String companyName;
  private String companyDescription;
  private String companyEmail;
  private String contactPhone;

  public EmployerProfileManager() {
    companyName = "";
    companyDescription = "";
    companyEmail = "";
    contactPhone = "";
  }

  public boolean createEmployerProfile(String companyName, String companyDescription, String companyEmail, String contactPhone) {
    this.companyName = companyName;
    this.companyDescription = companyDescription;
    this.companyEmail = companyEmail;
    this.contactPhone = contactPhone;

    System.out.println("Employer Profile Created Successfully");
    return true;
  }

  public boolean editEmployerProfile(String companyName, String companyDescription, String companyEmail, String contactPhone) {
    if(this.companyName.equals(companyName)) {
      this.companyName = companyName;
      this.companyDescription = companyDescription;
      this.companyEmail = companyEmail;
      this.contactPhone = contactPhone;

      System.out.println("Employer Profile Edited Successfully");
      return true;
    }
    else {
      System.out.println("Employer profile with company name " + companyName + " does not exist");
      return false;
    }
  }
  public boolean deleteEmployerProfile(String companyName) {
    if(this.companyName.equals(companyName)) {
      this.companyName = "";
      this.companyDescription = "";
      this.companyEmail = "";
      this.contactPhone = "";
      System.out.println("Employer Profile Deleted Successfully");
      return true;
    }
    else{
      System.out.println("Employer profile with company name " + companyName + " does not exist");
      return false;
    }
  }

  public String toString(){
    return "Employer Profile: \n" +
            "Company Name: " + companyName + "\n" +
            "Company Description: " + companyDescription + "\n" +
            "Contact Phone: " + contactPhone + "\n" +
            "Contact Email: " + companyEmail + "\n";
  }
}