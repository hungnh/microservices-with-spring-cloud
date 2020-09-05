package uet.hungnh.microservicewithspring.lab05sentence.service.word;

import org.springframework.stereotype.Service;
import uet.hungnh.microservicewithspring.lab05sentence.client.VerbClient;
import uet.hungnh.microservicewithspring.lab05sentence.constants.WordType;
import uet.hungnh.microservicewithspring.lab05sentence.dto.Word;

@Service
public class VerbService implements WordService {

    private final VerbClient client;

    public VerbService(VerbClient client) {
        this.client = client;
    }

    @Override
    public WordType supportedWordType() {
        return WordType.VERB;
    }

    @Override
    public Word getWord() {
        return client.getWord();
    }
}
