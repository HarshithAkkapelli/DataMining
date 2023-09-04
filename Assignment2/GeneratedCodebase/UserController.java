import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // Write GET and SET methods for handling HTTP requests related to users
    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable String userId) {
        return userService.getUserById(userId);
    }

    @PutMapping("/users/{userId}")
    public User updateUser(@PathVariable String userId, @RequestBody User user) {
        return userService.updateUser(userId, user);
    }

    @DeleteMapping("/users/{userId}")
    public void deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
    }

    @GetMapping("/users")
    public Iterable<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }

    @GetMapping("/users/{email}/{password}")
    public User getUserByEmailAndPassword(@PathVariable String email, @PathVariable String password) {
        return userService.getUserByEmailAndPassword(email, password);
    }
}
