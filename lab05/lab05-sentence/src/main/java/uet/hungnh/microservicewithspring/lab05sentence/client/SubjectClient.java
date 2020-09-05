package uet.hungnh.microservicewithspring.lab05sentence.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import uet.hungnh.microservicewithspring.lab05sentence.constants.ClientId;
import uet.hungnh.microservicewithspring.lab05sentence.dto.Word;

@FeignClient(ClientId.SUBJECT)
public interface SubjectClient {
    @GetMapping("/")
    Word getWord();
}
