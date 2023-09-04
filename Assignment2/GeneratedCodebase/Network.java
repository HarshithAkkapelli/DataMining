import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Network {

    @Id
    private Long id;
    private String userId1;
    private String userId2;
    private Long timestamp;

    // Write getters and setters for this class
    // Write a default constructor for this class
    public Network() {
        super();
    }

    public Network(Long id, String userId1, String userId2, Long timestamp) {
        super();
        this.id = id;
        this.userId1 = userId1;
        this.userId2 = userId2;
        this.timestamp = timestamp;
    }

    public Network(String userId1, String userId2, Long timestamp) {
        super();
        this.userId1 = userId1;
        this.userId2 = userId2;
        this.timestamp = timestamp;
    }

    public Network(String userId1, String userId2) {
        super();
        this.userId1 = userId1;
        this.userId2 = userId2;
    }

    public Network(Long id, String userId1, String userId2) {
        super();
        this.id = id;
        this.userId1 = userId1;
        this.userId2 = userId2;
    }

    public Network(String userId1, String userId2, Long timestamp, Long id) {
        super();
        this.id = id;
        this.userId1 = userId1;
        this.userId2 = userId2;
        this.timestamp = timestamp;
    }

    // Write toString() method for this class
    @Override
    public String toString() {
        return "Network [id=" + id + ", userId1=" + userId1 + ", userId2=" + userId2 + ", timestamp=" + timestamp
                + "]";
    }

    public Long getId() {
        return id;
    }

    public String getUserId1() {
        return userId1;
    }

    public String getUserId2() {
        return userId2;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId1(String userId1) {
        this.userId1 = userId1;
    }

    public void setUserId2(String userId2) {
        this.userId2 = userId2;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
