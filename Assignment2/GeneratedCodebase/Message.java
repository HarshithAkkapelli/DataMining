import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {

    @Id
    private Long id;
    private String senderId;
    private String receiverId;
    private String content;
    private Long timestamp;

    // Write getters and setters for this class
    public Message() {
    }

    public Message(Long id, String senderId, String receiverId, String content, Long timestamp) {
        this.id = id;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.content = content;
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getReceiverId() {
        return receiverId;
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

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}

