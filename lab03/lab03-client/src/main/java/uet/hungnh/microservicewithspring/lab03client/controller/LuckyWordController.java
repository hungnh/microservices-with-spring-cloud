package uet.hungnh.microservicewithspring.lab03client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckyWordController {
    @Value("${lucky-word}")
    private String luckyWord;

    @GetMapping("/lucky-word")
    public String showLuckyWord() {
        return String.format("Lucky word is %s", luckyWord);
    }
}
