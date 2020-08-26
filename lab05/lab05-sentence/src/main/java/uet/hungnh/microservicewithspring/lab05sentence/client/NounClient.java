package uet.hungnh.microservicewithspring.lab05sentence.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import uet.hungnh.microservicewithspring.lab05sentence.dto.Word;

@FeignClient(ClientId.NOUN)
public interface NounClient {
    @GetMapping("/")
    Word getWord();
}
