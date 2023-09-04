// Write test cases for this class in mockito
// Path: CommentControllerTest.java

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CommentControllerTest {

    @InjectMocks
    private CommentController commentController;

    @Mock
    private CommentService commentService;

    @Test
    public void getAllCommentsTest() {
        List<Comment> comments = new ArrayList<>();
        when(commentService.getAllComments()).thenReturn(comments);

        List<Comment> result = commentController.getAllComments();

        assertEquals(comments, result);
        verify(commentService).getAllComments();
    }

    @Test
    public void addCommentTest() {
        Comment comment = new Comment();
        commentController.addComment(comment);
        verify(commentService).addComment(comment);
    }
}