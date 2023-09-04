//Write unit tests cases for this class using mockito
// Path: MessageService.java
// Compare this snippet from MessageServiceTest.java:
// Write unit tests for this class in mockito using @MockBean and @InjectMocks
// Compare this snippet from MessageService.java:
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import com.stackroute.keepnote.model.Message;
import com.stackroute.keepnote.repository.MessageRepository;

@RunWith(MockitoJUnitRunner.class)
public class MessageTest {

    @Mock
    private MessageRepository messageRepository;

    @InjectMocks
    private MessageService messageService;

    private Message message;
    private List<Message> messageList;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        messageList = new ArrayList<>();
        message = new Message(1L, "1", "John", "Good", 123456L);
        messageList.add(message);
        message = new Message(2L, "1", "John", "Good", 123456L);
        messageList.add(message);
        message = new Message(3L, "1", "John", "Good", 123456L);
        messageList.add(message);
    }

    @Test
    public void testCreateMessageSuccess() {
        when(messageRepository.save((Message) any())).thenReturn(message);
        Message savedMessage = messageService.createMessage(message);
        assertNotNull(savedMessage);
        assertEquals(1L, savedMessage.getId().longValue());
    }

    @Test
    public void testCreateMessageFailure() {
        when(messageRepository.save((Message) any())).thenReturn(null);
        Message savedMessage = messageService.createMessage(message);
        assertNull(savedMessage);
    }

}