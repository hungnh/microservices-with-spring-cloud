package uet.hungnh.microservicewithspring.lab05sentence.service;

import org.springframework.stereotype.Service;
import uet.hungnh.microservicewithspring.lab05sentence.client.*;

/**
 * Build a sentence by assembling randomly generated subjects, verbs,
 * articles, adjectives, and nouns.  The individual parts of speech will
 * be obtained by calling the various DAOs.
 */
@Service
public class SentenceServiceImpl implements SentenceService {

    private final VerbClient verbClient;
    private final SubjectClient subjectClient;
    private final ArticleClient articleClient;
    private final AdjectiveClient adjectiveClient;
    private final NounClient nounClient;

    public SentenceServiceImpl(VerbClient verbClient,
                               SubjectClient subjectClient,
                               ArticleClient articleClient,
                               AdjectiveClient adjectiveClient,
                               NounClient nounClient) {
        this.verbClient = verbClient;
        this.subjectClient = subjectClient;
        this.articleClient = articleClient;
        this.adjectiveClient = adjectiveClient;
        this.nounClient = nounClient;
    }

    /**
     * Assemble a sentence by gathering random words of each part of speech:
     */
    public String buildSentence() {
        return String.format("%s %s %s %s %s.",
                subjectClient.getWord().getString(),
                verbClient.getWord().getString(),
                articleClient.getWord().getString(),
                adjectiveClient.getWord().getString(),
                nounClient.getWord().getString());
    }
}
