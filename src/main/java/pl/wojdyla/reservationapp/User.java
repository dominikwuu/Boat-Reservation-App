package pl.wojdyla.reservationapp;

public class User {
    private String name;
    private String firstName;
    private String telephoneNumber;
    private String emailAdress;


    public User(String name, String firstName, String telephoneNumber, String emailAdress) {
        this.name = name;
        this.firstName = firstName;
        this.telephoneNumber = telephoneNumber;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }
}
