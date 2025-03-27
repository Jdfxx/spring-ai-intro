package pl.filiphagno.springaiintro.services;

import pl.filiphagno.springaiintro.model.Answer;
import pl.filiphagno.springaiintro.model.CapitalResponse;
import pl.filiphagno.springaiintro.model.GetCapitalRequest;
import pl.filiphagno.springaiintro.model.Question;

public interface OpenAIService {
    String getAnswer(String question);
    Answer getAnswer(Question question);
    CapitalResponse getCapital(GetCapitalRequest getCapitalRequest);
    Answer getCapitalWithInfo(GetCapitalRequest getCapitalRequest);
}
