import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NetworkController {

    @Autowired
    private NetworkService networkService;

    // Write GET and POST methods for this class
    // Write GET and POST methods for this class
    @GetMapping("/api/v1/network")
    public ResponseEntity<?> getAllNetwork() {
        return new ResponseEntity<List<Network>>(networkService.getAllNetwork(), HttpStatus.OK);
    }

    @PostMapping("/api/v1/network")
    public ResponseEntity<?> createNetwork(@RequestBody Network network) {
        Network savedNetwork = networkService.createNetwork(network);
        if (savedNetwork != null) {
            return new ResponseEntity<Network>(savedNetwork, HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("Network Not Created", HttpStatus.CONFLICT);
        }
    }
}
