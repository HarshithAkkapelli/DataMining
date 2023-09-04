// Write unit test cases for Network.java in mockito using @MockBean and @InjectMocks
// Compare this snippet from NetworkService.java:
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import com.stackroute.keepnote.model.Network;
import com.stackroute.keepnote.repository.NetworkRepository;

@RunWith(MockitoJUnitRunner.class)
public class NetworkTest {

    @Mock
    private NetworkRepository networkRepository;

    @InjectMocks
    private NetworkService networkService;

    private Network network;
    private List<Network> networkList;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        networkList = new ArrayList<>();
        network = new Network(1L, "1", "John", 123456L);
        networkList.add(network);
        network = new Network(2L, "1", "John", 123456L);
        networkList.add(network);
        network = new Network(3L, "1", "John", 123456L);
        networkList.add(network);
    }

    @Test
    public void testCreateNetworkSuccess() {
        when(networkRepository.save((Network) any())).thenReturn(network);
        Network savedNetwork = networkService.createNetwork(network);
        assertNotNull(savedNetwork);
        assertEquals(1L, savedNetwork.getId().longValue());
    }

    @Test
    public void testCreateNetworkFailure() {
        when(networkRepository.save((Network) any())).thenReturn(null);
        Network savedNetwork = networkService.createNetwork(network);
        assertNull(savedNetwork);
    }

    @Test
    public void testGetAllNetworks() {
        when(networkRepository.findAll()).thenReturn(networkList);
        List<Network> networkList = (List<Network>) networkService.getAllNetworks();
    }
}