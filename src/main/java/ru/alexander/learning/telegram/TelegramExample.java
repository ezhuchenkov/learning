package ru.alexander.learning.telegram;

import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.telegram.telegrambots.ApiContext;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

public class TelegramExample {
    private static String PROXY_HOST = "vamtlgrm.drproxy.pro" /* proxy host */;
    private static Integer PROXY_PORT = 1011 /* proxy port */;
    static Update update = new Update();

    public static void main(String[] args) throws TelegramApiRequestException {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        DefaultBotOptions botOptions = ApiContext.getInstance(DefaultBotOptions.class);
        HttpHost httpHost = new HttpHost(PROXY_HOST, PROXY_PORT);
        RequestConfig requestConfig = RequestConfig.custom().setProxy(httpHost).setAuthenticationEnabled(false).build();
        botOptions.setRequestConfig(requestConfig);
        botOptions.setHttpProxy(httpHost);

        ExchangeBot bot = new ExchangeBot(botOptions);
        telegramBotsApi.registerBot(bot);
        bot.onUpdateReceived(update);


    }

}
