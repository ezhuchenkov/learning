package ru.alexander.learning.telegram;

import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

public class ExchangeBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {

    }

    @Override
    public String getBotUsername() {
        return "Currency bot";
    }

    @Override
    public String getBotToken() {
        return "591243527:AAEA8b0xY42EvM7iKsMbM-v-mYBLo6x2AMI";
    }

}
