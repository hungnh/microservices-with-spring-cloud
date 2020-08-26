package uet.hungnh.microservicewithspring.lab05word.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uet.hungnh.microservicewithspring.lab05word.dto.Word;

import java.util.Random;

@RestController
public class WordController {

    private final Random random = new Random();

    @Value("${words}")
    private String[] words;

    @GetMapping("/")
    public Word getWord() {
        String word = words[random.nextInt(words.length)];
        System.out.printf("Generated Word:%s\n", word);
        return new Word(word);
    }
}
