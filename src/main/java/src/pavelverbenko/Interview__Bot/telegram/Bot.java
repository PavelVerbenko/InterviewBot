package src.pavelverbenko.Interview__Bot.telegram;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import src.pavelverbenko.Interview__Bot.client.OpenAiClient;

//тут мы обработываем обновленя, которые нам прилетают с telegram
@Component
public class Bot extends TelegramLongPollingBot {
    private final OpenAiClient openAiClent;

    public Bot(@Value("${bot.token}") String token, OpenAiClient openAiClent) {
        super(token);
        this.openAiClent = openAiClent;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && "/start".equals(update.getMessage().getText())) {
            openAiClent.promptModel(закинуть сюда потом промт);
        }
        SendMessage message = new SendMessage();
        message.setChatId(update.getMessage().getChatId().toString());
        message.setText("Hello, " + update.getMessage().getFrom().getFirstName() + "!");
        try {
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getBotUsername() {
        return "JavaVerbInterviewBot";
    }
}
