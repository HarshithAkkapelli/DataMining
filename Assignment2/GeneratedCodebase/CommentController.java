import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;
        //Write Get and POST methods here
       @GetMapping("/comments")
       public List<Comment> getAllComments() {
           return commentService.getAllComments();
       }
    
       @PostMapping("/comments")
       public void addComment(@RequestBody Comment comment) {
           commentService.addComment(comment);
       }
}

