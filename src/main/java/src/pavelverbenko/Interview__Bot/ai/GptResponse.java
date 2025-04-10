package src.pavelverbenko.Interview__Bot.ai;

import lombok.Data;
import java.util.List;

//тут класс нужен для ответа от ИИ
@Data
public class GptResponse {

    private List<Choice> choices;

    @Data
    public static class Choice {
        private Message message;
    }

    @Data
    public static class Message {
        private String content;
    }
}
