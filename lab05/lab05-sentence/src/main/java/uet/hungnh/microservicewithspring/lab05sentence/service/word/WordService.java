package uet.hungnh.microservicewithspring.lab05sentence.service.word;

import uet.hungnh.microservicewithspring.lab05sentence.constants.WordType;
import uet.hungnh.microservicewithspring.lab05sentence.dto.Word;

public interface WordService {
    WordType supportedWordType();

    Word getWord();
}
