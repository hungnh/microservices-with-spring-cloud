package uet.hungnh.microservicewithspring.lab05sentence.service;

import org.springframework.stereotype.Service;
import uet.hungnh.microservicewithspring.lab05sentence.constants.WordType;
import uet.hungnh.microservicewithspring.lab05sentence.service.word.WordServiceManager;

/**
 * Build a sentence by assembling randomly generated subjects, verbs,
 * articles, adjectives, and nouns.  The individual parts of speech will
 * be obtained by calling the various DAOs.
 */
@Service
public class SentenceServiceImpl implements SentenceService {

    private final WordServiceManager wordService;

    public SentenceServiceImpl(WordServiceManager wordService) {
        this.wordService = wordService;
    }

    /**
     * Assemble a sentence by gathering random words of each part of speech:
     */
    public String buildSentence() {
        return String.format("%s %s %s %s %s.",
                wordService.getWord(WordType.SUBJECT).getString(),
                wordService.getWord(WordType.VERB).getString(),
                wordService.getWord(WordType.ARTICLE).getString(),
                wordService.getWord(WordType.ADJECTIVE).getString(),
                wordService.getWord(WordType.NOUN).getString());
    }
}
