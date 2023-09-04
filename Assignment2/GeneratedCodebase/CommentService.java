import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    // Write methods for sending, deleting, getting comments by id, getting all
    @Autowired
    private CommentRepository commentRepository;

    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }

    public Comment getComment(Long id) {
        return commentRepository.findById(id).orElse(null);
    }

    // Write a method for getting all comments for a post
    public List<Comment> getCommentsForPost(String postId) {
        return commentRepository.findByPostId(postId);
    }
}

