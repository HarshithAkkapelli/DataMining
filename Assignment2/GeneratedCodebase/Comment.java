import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comment {

    @Id
    private Long id;
    private String postId;
    private String userId;
    private String content;
    private Long timestamp;

   // Write getters and setters for this class
    public Comment() {
    }

    public Comment(Long id, String postId, String userId, String content, Long timestamp) {
        this.id = id;
        this.postId = postId;
        this.userId = userId;
        this.content = content;
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public String getPostId() {
        return postId;
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

    public void setPostId(String postId) {
        this.postId = postId;
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



