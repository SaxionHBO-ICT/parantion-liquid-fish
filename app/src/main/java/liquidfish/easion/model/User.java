package liquidfish.easion.model;

import java.util.Date;

/**
 * Created by Rick on 31-5-2016.
 */
public class User {
    private String username;
    private String firstname;
    private String middlename;//tussenvoegsel
    private String lastname;
    private String email;
    private Date lastLogin;
    private Date registrationDate;
    private String profilePicture;
    private String uitstroomProfiel;
    private String studentNumber;

    public User(String username, String firstname, String middlename, String lastname, String email, String uitstroomProfiel, String studentNumber) {
        this.username = username;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.email = email;
        this.uitstroomProfiel = uitstroomProfiel;
        this.studentNumber = studentNumber;
    }

    public User(String username, String email, String lastname) {
        this.username = username;
        this.email = email;
        this.lastname = lastname;
    }

    protected User(User another){
        this.username = another.getUsername();
        this.firstname = another.getFirstname();
        this.middlename = another.getMiddlename();
        this.lastname = another.getLastname();
        this.email = another.getEmail();
        this.uitstroomProfiel = another.getUitstroomProfiel();
        this.studentNumber = another.getStudentNumber();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public String getUitstroomProfiel() {
        return uitstroomProfiel;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public User getCopy(){
        return new User(this);
    }
}
