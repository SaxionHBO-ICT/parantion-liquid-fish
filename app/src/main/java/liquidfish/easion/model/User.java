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
    private int studentNumber;

    public User(String username, String firstname, String middlename, String lastname, String email, String uitstroomProfiel, int studentNumber) {
        this.username = username;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.email = email;
       this.uitstroomProfiel = uitstroomProfiel;
        this.studentNumber = studentNumber;
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

    public int getStudentNumber() {
        return studentNumber;
    }
}
