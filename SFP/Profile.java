package SFP;

import java.util.List;

public class Profile {
    private String profileID;
    private String username;
    private String hashedpw;
    private List<Bank> bank;
    private List<Budget> budget;

    private Profile(String profileID, String username, String hashedpw, List<Bank> bank, List<Budget> budget) {
        setProfileID(profileID);
        setUsername(username);
        setHashedpw(hashedpw);
        setBank(bank);
        setBudget(budget);
    }

    public String getProfileID() {
        return profileID;
    }

    public void setProfileID(String profileID) {
        this.profileID = profileID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHashedpw() {
        return hashedpw;
    }

    public void setHashedpw(String hashedpw) {
        this.hashedpw = hashedpw;
    }

    public List<Bank> getBank() {
        return bank;
    }

    public void setBank(List<Bank> bank) {
        this.bank = bank;
    }

    public List<Budget> getBudget() {
        return budget;
    }

    public void setBudget(List<Budget> budget) {
        this.budget = budget;
    }

    public Profile signUp(String username, String password) {
        // Implementation for signing up a new user
        /*Do the verification, encypt the password and then call the constructor*/
        return  new Profile(generateProfileID(), username, hashPassword(password), null, null);
    }

    private String hashPassword(String password) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hashPassword'");
    }

    private String generateProfileID() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generateProfileID'");
    }

    public double getProfileBalance() {
        // Implementation for getting the profile balance
        return 0.0; // Placeholder return value
    }
}

/**
 * - profileID*: UUID;
 * - username: String;
 * - hashedpw: String;
 * - bank: List<Bank>;
 * - budget: List<Budget>
 * + signUp(username: String, password: String);
 * + getProfileBalance(): double;
 *profileID is random generated.
 */