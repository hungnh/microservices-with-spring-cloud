package uet.hungnh.microservicewithspring.sentence.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
public class SentenceController {
    private final DiscoveryClient discoveryClient;

    public SentenceController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/sentence")
    public String getSentence() {
        return
                getWord("LAB04-SUBJECT") + " "
                        + getWord("LAB04-VERB") + " "
                        + getWord("LAB04-ARTICLE") + " "
                        + getWord("LAB04-ADJECTIVE") + " "
                        + getWord("LAB04-NOUN") + "."
                ;
    }

    public String getWord(String service) {
        List<ServiceInstance> list = discoveryClient.getInstances(service);
        if (list != null && list.size() > 0) {
            URI uri = list.get(0).getUri();
            if (uri != null) {
                return (new RestTemplate()).getForObject(uri, String.class);
            }
        }
        return null;
    }
}
