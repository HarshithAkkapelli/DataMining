import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    // Write methods for creating, deleting, getting posts by authorId
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

    public Iterable<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Iterable<Post> getAllPostsByAuthorId(String authorId) {
        return postRepository.findAllByAuthorId(authorId);
    }
}

