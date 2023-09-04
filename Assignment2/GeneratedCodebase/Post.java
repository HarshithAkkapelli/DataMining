import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Post {

    @Id
    private Long id;
    private String userId;
    private String content;
    private Long timestamp;

    // Write getters an setters for this class
    // Write a default constructor for this class
    public Post() {
        super();
    }

    public Post(Long id, String userId, String content, Long timestamp) {
        super();
        this.id = id;
        this.userId = userId;
        this.content = content;
        this.timestamp = timestamp;
    }

    public Post(String userId, String content, Long timestamp) {
        super();
        this.userId = userId;
        this.content = content;
        this.timestamp = timestamp;
    }

    public Post(String userId, String content) {
        super();
        this.userId = userId;
        this.content = content;
    }

    public Post(Long id, String userId, String content) {
        super();
        this.id = id;
        this.userId = userId;
        this.content = content;
    }

    public Post(String userId, String content, Long timestamp, Long id) {
        super();
        this.id = id;
        this.userId = userId;
        this.content = content;
        this.timestamp = timestamp;
    }

    // Write toString() method for this class
    @Override
    public String toString() {
        return "Post [id=" + id + ", userId=" + userId + ", content=" + content + ", timestamp=" + timestamp + "]";
    }

    public Long getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}


