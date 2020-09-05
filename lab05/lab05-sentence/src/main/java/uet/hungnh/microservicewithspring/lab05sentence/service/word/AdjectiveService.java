package uet.hungnh.microservicewithspring.lab05sentence.service.word;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import uet.hungnh.microservicewithspring.lab05sentence.client.AdjectiveClient;
import uet.hungnh.microservicewithspring.lab05sentence.constants.WordType;
import uet.hungnh.microservicewithspring.lab05sentence.dto.Word;

@Service
public class AdjectiveService implements WordService {

    private final AdjectiveClient client;

    public AdjectiveService(AdjectiveClient client) {
        this.client = client;
    }

    @Override
    public WordType supportedWordType() {
        return WordType.ADJECTIVE;
    }

    @Override
    @HystrixCommand(fallbackMethod = "getDefaultWord")
    public Word getWord() {
        return client.getWord();
    }

    public Word getDefaultWord() {
        return new Word("");
    }
}
