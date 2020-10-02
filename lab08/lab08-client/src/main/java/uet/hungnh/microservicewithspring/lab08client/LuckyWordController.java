package uet.hungnh.microservicewithspring.lab08client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class LuckyWordController {
	@Value("${wordConfig.luckyWord}")
    private String luckyWord;

	@Value("${wordConfig.preamble}")
    private String preamble;

    @GetMapping("/lucky-word")
    public String showLuckyWord() {
        return preamble + ": " + luckyWord;
    }
}
