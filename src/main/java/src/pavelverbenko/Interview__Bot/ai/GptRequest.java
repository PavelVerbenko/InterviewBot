package src.pavelverbenko.Interview__Bot.ai;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

//Тут формируется тело запроса
@Builder
@Getter
public class GptRequest {
    private String model;
    private List<Message> messages;

    @Builder
    @Getter
    public static class Message {
        private String role;
        private String content;
    }
}
