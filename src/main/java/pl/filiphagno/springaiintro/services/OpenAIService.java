package pl.filiphagno.springaiintro.services;

import org.springframework.web.multipart.MultipartFile;
import pl.filiphagno.springaiintro.model.Answer;
import pl.filiphagno.springaiintro.model.CapitalResponse;
import pl.filiphagno.springaiintro.model.GetCapitalRequest;
import pl.filiphagno.springaiintro.model.Question;

public interface OpenAIService {
    String getAnswer(String question);
    Answer getAnswer(Question question);
    CapitalResponse getCapital(GetCapitalRequest getCapitalRequest);
    Answer getCapitalWithInfo(GetCapitalRequest getCapitalRequest);

    Answer getWeather(Question question);

    Answer getStockPrice(Question question);

    byte[] getImage(Question question);

    String getDescription(MultipartFile file);

    byte[] getSpeech(Question question);
}
