package models.contact;

public class Contact {
    private String email;
    private String phoneNumber;
    private String mobileNumber;

    public Contact(String email, String phoneNumber, String mobileNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}
