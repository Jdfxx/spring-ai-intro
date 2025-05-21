package pl.filiphagno.springaiintro.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OpenAIServiceImplTest {

    @Autowired
    private OpenAIService openAIService;

    @Test
    public void testGetAnswer() {
        String response = openAIService.getAnswer("Is java good for AI");
        System.out.println(response);
        Assertions.assertNotNull(response);
    }
}