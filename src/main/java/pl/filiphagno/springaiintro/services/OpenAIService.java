package pl.filiphagno.springaiintro.services;

import pl.filiphagno.springaiintro.model.Answer;
import pl.filiphagno.springaiintro.model.GetCapitalRequest;
import pl.filiphagno.springaiintro.model.Question;

public interface OpenAIService {
    String getAnswer(String question);
    Answer getAnswer(Question question);
    Answer getCapital(GetCapitalRequest getCapitalRequest);
}
