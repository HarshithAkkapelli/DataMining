import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    // methods for handling HTTP requests related to messages will be added here
    @GetMapping("/messages")
    public List<Message> getAllMessages() {
        return messageService.getAllMessages();
    }

    @PostMapping("/messages")
    public void addMessage(@RequestBody Message message) {
        messageService.addMessage(message);
    }
}
