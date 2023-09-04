import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    // Write POST and GET methods for creating, deleting, getting posts by authorId
    @PostMapping("/posts")
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }

    @DeleteMapping("/posts/{id}")
    public void deletePost(@PathVariable Long id) {
        postService.deletePost(id);
    }

    @GetMapping("/posts")
    public Iterable<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/posts/{authorId}")
    public Iterable<Post> getAllPostsByAuthorId(@PathVariable String authorId) {
        return postService.getAllPostsByAuthorId(authorId);
    }
}
