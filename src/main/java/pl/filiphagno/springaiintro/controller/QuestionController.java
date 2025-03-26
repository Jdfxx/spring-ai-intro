package pl.filiphagno.springaiintro.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.filiphagno.springaiintro.model.Answer;
import pl.filiphagno.springaiintro.model.Question;
import pl.filiphagno.springaiintro.services.OpenAIService;

@RestController
public class QuestionController {

    OpenAIService openAIService;

    public QuestionController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @PostMapping("/ask")
    public Answer getAnswer(@RequestBody Question question) {
        return openAIService.getAnswer(question);
    }
}
