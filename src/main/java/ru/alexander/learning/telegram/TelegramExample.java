package ru.alexander.learning.telegram;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.telegram.telegrambots.ApiContext;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class TelegramExample {
    private static String PROXY_HOST = "phobos.public.opennetwork.cc" /* proxy host */;
    private static Integer PROXY_PORT = 1090 /* proxy port */;
    private static String PROXY_USER = "201154259";
    private static String PROXY_USER_PASS = "ytpgQagQ" /* proxy password */;
    static CredentialsProvider credsProvider;

    public static void main(String[] args) {
        try {

            ApiContextInitializer.init();
            TelegramBotsApi botsApi = new TelegramBotsApi();
            DefaultBotOptions botOptions = ApiContext.getInstance(DefaultBotOptions.class);
            credsProvider = new BasicCredentialsProvider();
            credsProvider.setCredentials(
                    new AuthScope(PROXY_HOST, PROXY_PORT),
                    new UsernamePasswordCredentials(PROXY_USER, PROXY_USER_PASS));

            HttpHost httpHost = new HttpHost(PROXY_HOST, PROXY_PORT);

            RequestConfig requestConfig = RequestConfig.custom().setProxy(httpHost).setAuthenticationEnabled(true).build();

            botOptions.setRequestConfig(requestConfig);
            botOptions.setCredentialsProvider(credsProvider);
            botOptions.setHttpProxy(httpHost);



            botsApi.registerBot(new ExchangeBot(botOptions));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }




    }

}
