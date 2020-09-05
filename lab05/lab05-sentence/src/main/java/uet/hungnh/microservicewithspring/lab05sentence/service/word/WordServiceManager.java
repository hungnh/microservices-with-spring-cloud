package uet.hungnh.microservicewithspring.lab05sentence.service.word;

import org.springframework.stereotype.Component;
import uet.hungnh.microservicewithspring.lab05sentence.constants.WordType;
import uet.hungnh.microservicewithspring.lab05sentence.dto.Word;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

@Component
public class WordServiceManager {

    private final Map<WordType, WordService> wordServices;

    public WordServiceManager(List<WordService> wordServices) {
        this.wordServices = wordServices.stream()
                .collect(toMap(WordService::supportedWordType, Function.identity()));
    }

    public Word getWord(WordType wordType) {
        WordService wordService = wordServices.get(wordType);
        if (Objects.isNull(wordService)) {
            throw new UnsupportedOperationException("Unsupported word type");
        } else {
            return wordService.getWord();
        }
    }
}
