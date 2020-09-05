package uet.hungnh.microservicewithspring.lab05sentence.service.word;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import uet.hungnh.microservicewithspring.lab05sentence.client.NounClient;
import uet.hungnh.microservicewithspring.lab05sentence.constants.WordType;
import uet.hungnh.microservicewithspring.lab05sentence.dto.Word;

@Service
public class NounService implements WordService {

    private final NounClient client;

    public NounService(NounClient client) {
        this.client = client;
    }

    @Override
    public WordType supportedWordType() {
        return WordType.NOUN;
    }

    @Override
    @HystrixCommand(fallbackMethod = "getDefaultWord")
    public Word getWord() {
        return client.getWord();
    }

    public Word getDefaultWord() {
        return new Word("something");
    }
}
