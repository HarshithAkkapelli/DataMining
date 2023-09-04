//Write unit test case for this class using mockito
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import com.stackroute.keepnote.model.Comment;

@RunWith(MockitoJUnitRunner.class)
public class CommentTest {

    @InjectMocks
    Comment comment;

    @Test
    public void testCommentSuccess() {

        comment = new Comment(1L, "1", "John", "Good", 123456L);

        assertNotNull(comment);
        assertEquals(1L, comment.getId().longValue());
        assertEquals("1", comment.getPostId());
        assertEquals("John", comment.getUserId());
        assertEquals("Good", comment.getContent());
        assertEquals(123456L, comment.getTimestamp().longValue());

    }

    @Test
    public void testCommentFailure() {

        comment = new Comment(1L, "1", "John", "Good", 123456L);

        assertNotNull(comment);
        assertEquals(1L, comment.getId().longValue());
        assertEquals("1", comment.getPostId());
        assertEquals("John", comment.getUserId());
        assertEquals("Good", comment.getContent());
        assertEquals(123456L, comment.getTimestamp().longValue());

    }
}