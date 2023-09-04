//Write test cases for User classes using mockito
//Compare this snippet from UserServiceTest.java:
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import com.stackroute.keepnote.model.User;
import com.stackroute.keepnote.repository.UserRepository;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

   @Mock
   private UserRepository userRepository;

   @InjectMocks
   private UserService userService;

   private User user;
   private List<User> userList;

   @Before
   public void setUp() throws Exception {
       MockitoAnnotations.initMocks(this);
       userList = new ArrayList<>();
       user = new User("1", "John", "john123", "john@gmail");
       userList.add(user);
       user = new User("2", "John", "john123", "john@gmail");
       userList.add(user);
       user = new User("3", "John", "john123", "john@gmail");
       userList.add(user);
   }

   @Test
   public void testCreateUserSuccess() {
       when(userRepository.save((User) any())).thenReturn(user);
       User savedUser = userService.createUser(user);
       assertNotNull(savedUser);
       assertEquals("1", savedUser.getUsername());
   }

   @Test
   public void testCreateUserFailure() {
       when(userRepository.save((User) any())).thenReturn(null);
       User savedUser = userService.createUser(user);
       assertNull(savedUser);
   }

   @Test
   public void testGetAllUsers() {
       when(userRepository.findAll()).thenReturn(userList);
       List<User> users = userService.getAllUsers();
       assertEquals(3, users.size());
   }

}