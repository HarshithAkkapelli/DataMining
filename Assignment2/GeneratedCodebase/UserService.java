import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Write user registration, login, profile management methods here
    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(String userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public User updateUser(String userId, User user) {
        User existingUser = getUserById(userId);
        if (existingUser != null) {
            existingUser.setAge(user.getAge());
            existingUser.setGender(user.getGender());
            existingUser.setCity(user.getCity());
            existingUser.setCountry(user.getCountry());
            existingUser.setPhone(user.getPhone());
            existingUser.setProfile(user.getProfile());
            return userRepository.save(existingUser);
        }
        return null;
    }

    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User getUserByEmailAndPassword(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }
}


// Write unit tests cases for above class "UserService". Class name should be UserServiceTest