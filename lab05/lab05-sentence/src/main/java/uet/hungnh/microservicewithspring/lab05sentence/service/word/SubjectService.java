package uet.hungnh.microservicewithspring.lab05sentence.service.word;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import uet.hungnh.microservicewithspring.lab05sentence.client.SubjectClient;
import uet.hungnh.microservicewithspring.lab05sentence.constants.WordType;
import uet.hungnh.microservicewithspring.lab05sentence.dto.Word;

@Service
public class SubjectService implements WordService {

    private final SubjectClient client;

    public SubjectService(SubjectClient client) {
        this.client = client;
    }

    @Override
    public WordType supportedWordType() {
        return WordType.SUBJECT;
    }

    @Override
    @HystrixCommand(fallbackMethod = "getDefaultWord")
    public Word getWord() {
        return client.getWord();
    }

    public Word getDefaultWord() {
        return new Word("Someone");
    }
}
