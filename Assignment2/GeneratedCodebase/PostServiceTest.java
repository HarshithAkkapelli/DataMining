//Write unit tests for above class using mockito and assertj
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import com.stackroute.keepnote.model.Post;
import com.stackroute.keepnote.repository.PostRepository;

@RunWith(MockitoJUnitRunner.class)
public class PostServiceTest {

    @Mock
    private PostRepository postRepository;

    @InjectMocks
    private PostService postService;

    private Post post;
    private List<Post> postList;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        postList = new ArrayList<>();
        post = new Post(1L, "1", "John", 123456L);
        postList.add(post);
        post = new Post(2L, "1", "John", 123456L);
        postList.add(post);
        post = new Post(3L, "1", "John", 123456L);
        postList.add(post);
    }

    @Test
    public void testCreatePostSuccess() {
        when(postRepository.save((Post) any())).thenReturn(post);
        Post savedPost = postService.createPost(post);
        assertNotNull(savedPost);
        assertEquals(1L, savedPost.getId().longValue());
    }

    @Test
    public void testCreatePostFailure() {
        when(postRepository.save((Post) any())).thenReturn(null);
        Post savedPost = postService.createPost(post);
        assertNull(savedPost);
    }

    @Test
    public void testDeletePost() {
        doNothing().when(postRepository).deleteById(1L);
        postService.deletePost(1L);
    }

    @Test
    public void testGetAllPosts() {
        when(postRepository.findAll()).thenReturn(postList);
        Iterable<Post> postList = postService.getAllPosts();
        assertNotNull(postList);
    }

    @Test
    public void testGetAllPostsByAuthorId() {
        when(postRepository.findAllByAuthorId("1")).thenReturn(postList);
        Iterable<Post> postList = postService.getAllPostsByAuthorId("1");
        assertNotNull(postList);
    }
}