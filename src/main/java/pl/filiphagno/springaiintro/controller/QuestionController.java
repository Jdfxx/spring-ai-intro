package pl.filiphagno.springaiintro.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import pl.filiphagno.springaiintro.model.Answer;
import pl.filiphagno.springaiintro.model.CapitalResponse;
import pl.filiphagno.springaiintro.model.GetCapitalRequest;
import pl.filiphagno.springaiintro.model.Question;
import pl.filiphagno.springaiintro.services.OpenAIService;

import java.io.IOException;
import java.util.Map;

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

    @PostMapping("/capital")
    public CapitalResponse getCapital(@RequestBody GetCapitalRequest getCapitalRequest) {
        return this.openAIService.getCapital(getCapitalRequest);
    }

    @PostMapping("/capitalWithInfo")
    public Answer getCapitalWithInfo(@RequestBody GetCapitalRequest getCapitalRequest) {
        return this.openAIService.getCapitalWithInfo(getCapitalRequest);
    }

    @PostMapping("/weather")
    public Answer askQuestion(@RequestBody Question question) {
        return openAIService.getWeather(question);
    }

    @PostMapping("/stock")
    public Answer getStockPrice(@RequestBody Question question) {
        return openAIService.getStockPrice(question);
    }

    @PostMapping(value = "/image", produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] getImage(@RequestBody Question question) {
        return openAIService.getImage(question);
    }

    @PostMapping(value = "/vision", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> upload(
            @Validated @RequestParam("file") MultipartFile file,
            @RequestParam("name") String name
    ) throws IOException {
        return ResponseEntity.ok(openAIService.getDescription(file));
    }

    @PostMapping(value ="/talk", produces = "audio/mpeg")
    public byte[] talkTalk(@RequestBody Question question) {
        return openAIService.getSpeech(question);
    }

}
