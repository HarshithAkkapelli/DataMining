import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NetworkService {

    @Autowired
    private NetworkRepository networkRepository;

    // Write methods for creating, deleting, getting connections by userId1 and userId2
    public Network createNetwork(Network network) {
        return networkRepository.save(network);
    }

    public void deleteNetwork(Long id) {
        networkRepository.deleteById(id);
    }

    public Network getNetworkByUserId1AndUserId2(String userId1, String userId2) {
        return networkRepository.findByUserId1AndUserId2(userId1, userId2);
    }

    public Iterable<Network> getAllNetwork() {
        return networkRepository.findAll();
    }

    public Iterable<Network> getAllNetworkByUserId1(String userId1) {
        return networkRepository.findAllByUserId1(userId1);
    }

    public Iterable<Network> getAllNetworkByUserId2(String userId2) {
        return networkRepository.findAllByUserId2(userId2);
    }
}

