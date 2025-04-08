package src.pavelverbenko.Interview__Bot.telegram;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

//тут мы обработываем обновленя, которые нам прилетают с telegram
@Component
public class Bot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {

    }

    @Override
    public String getBotUsername() {
        return "JavaVerbInterviewBot";
    }
}
