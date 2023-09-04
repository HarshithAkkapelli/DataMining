import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    // Write methods for sending, deleting, getting messages by id, getting all
    // messages by senderId and receiverId

    public Message createMessage(Message message) {
        return messageRepository.save(message);
    }

    public void deleteMessage(Long id) {
        messageRepository.deleteById(id);
    }

    public Message getMessageById(Long id) {
        return messageRepository.findById(id).get();
    }

    public Iterable<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    public Iterable<Message> getAllMessagesBySenderId(String senderId) {
        return messageRepository.findAllBySenderId(senderId);
    }

    public Iterable<Message> getAllMessagesByReceiverId(String receiverId) {
        return messageRepository.findAllByReceiverId(receiverId);
    }
}
