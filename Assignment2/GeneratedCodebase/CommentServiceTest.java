// Write unit tests for this class in mockito using @MockBean and @InjectMocks
// Compare this snippet from CommentService.java:
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
import com.stackroute.keepnote.model.Comment;
import com.stackroute.keepnote.repository.CommentRepository;

@RunWith(MockitoJUnitRunner.class)
public class CommentServiceTest {

    @Mock
    private CommentRepository commentRepository;

    @InjectMocks
    private CommentService commentService;

    private Comment comment;
    private List<Comment> commentList;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        commentList = new ArrayList<>();
        comment = new Comment(1L, "1", "John", "Good", 123456L);
        commentList.add(comment);
        comment = new Comment(2L, "1", "John", "Good", 123456L);
        commentList.add(comment);
        comment = new Comment(3L, "1", "John", "Good", 123456L);
        commentList.add(comment);
    }

    @Test
    public void testCreateCommentSuccess() {
        when(commentRepository.save((Comment) any())).thenReturn(comment);
        Comment savedComment = commentService.createComment(comment);
        assertNotNull(savedComment);
        assertEquals(1L, savedComment.getId().longValue());
    }

    @Test
    public void testCreateCommentFailure() {
        when(commentRepository.save((Comment) any())).thenReturn(null);
        Comment savedComment = commentService.createComment(comment);
        assertNull(savedComment);
    }

    @Test
    public void testDeleteCommentSuccess() {
        doNothing
        .when(commentRepository)
        .deleteById(1L);
        commentService.deleteComment(1L);
    }

}