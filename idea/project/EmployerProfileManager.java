package idea.project;

class EmployerProfileManager extends JobPortalManager {
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

    @Override
    public boolean create(String... details) {
        this.companyName = details[0];
        this.companyDescription = details[1];
        this.companyEmail = details[2];
        this.contactPhone = details[3];

        System.out.println("Employer Profile Created Successfully");
        return true;
    }

    @Override
    public boolean edit(String... details) {
        if (this.companyName.equals(details[0])) {
            this.companyName = details[0];
            this.companyDescription = details[1];
            this.companyEmail = details[2];
            this.contactPhone = details[3];

            System.out.println("Employer Profile Edited Successfully");
            return true;
        } else {
            System.out.println("Employer profile with company name " + details[0] + " does not exist");
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        String companyName = String.valueOf(id);
        if (this.companyName.equals(companyName)) {
            this.companyName = "";
            this.companyDescription = "";
            this.companyEmail = "";
            this.contactPhone = "";
            System.out.println("Employer Profile Deleted Successfully");
            return true;
        } else {
            System.out.println("Employer profile with company name " + companyName + " does not exist");
            return false;
        }
    }

    public String toString() {
        return "Employer Profile: \n" +
                "Company Name: " + companyName + "\n" +
                "Company Description: " + companyDescription + "\n" +
                "Contact Phone: " + contactPhone + "\n" +
                "Contact Email: " + companyEmail + "\n";
    }
  }