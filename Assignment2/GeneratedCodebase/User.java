import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private String username;
    private String password;
    private String email;
    private String profilePicture;

    // Write getters and setters for this class
    // Write a default constructor for this class
    public User() {
        super();
    }

    public User(String username, String password, String email, String profilePicture) {
        super();
        this.username = username;
        this.password = password;
        this.email = email;
        this.profilePicture = profilePicture;
    }

    public User(String username, String password, String email) {
        super();
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Write toString() method for this class
    @Override
    public String toString() {
        return "User [username=" + username + ", password=" + password + ", email=" + email + ", profilePicture="
                + profilePicture + "]";
    }
}


