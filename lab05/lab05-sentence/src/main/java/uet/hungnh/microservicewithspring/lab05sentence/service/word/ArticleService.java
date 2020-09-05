package uet.hungnh.microservicewithspring.lab05sentence.service.word;

import org.springframework.stereotype.Service;
import uet.hungnh.microservicewithspring.lab05sentence.client.ArticleClient;
import uet.hungnh.microservicewithspring.lab05sentence.constants.WordType;
import uet.hungnh.microservicewithspring.lab05sentence.dto.Word;

@Service
public class ArticleService implements WordService {

    private final ArticleClient client;

    public ArticleService(ArticleClient client) {
        this.client = client;
    }

    @Override
    public WordType supportedWordType() {
        return WordType.ARTICLE;
    }

    @Override
    public Word getWord() {
        return client.getWord();
    }
}
