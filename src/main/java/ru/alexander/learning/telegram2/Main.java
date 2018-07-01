package ru.alexander.learning.telegram2;

import jdk.nashorn.internal.runtime.regexp.joni.Config;
import lombok.var;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.telegram.telegrambots.ApiContext;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class Main {

    private static String BOT_NAME = "Currency bot";
    private static String BOT_TOKEN = "591243527:AAEA8b0xY42EvM7iKsMbM-v-mYBLo6x2AMI" /* your bot's token here */;

    private static String PROXY_HOST = "136.243.63.59" /* proxy host */;
    private static Integer PROXY_PORT = 9090 /* proxy port */;
    private static String PROXY_USER = "telegram" /* proxy user */;
    private static String PROXY_PASSWORD = "telegram" /* proxy password */;

    public static void main(String[] args) {
        try {

            ApiContextInitializer.init();

            // Create the TelegramBotsApi object to register your bots
            TelegramBotsApi botsApi = new TelegramBotsApi();

            // Set up Http proxy
            DefaultBotOptions botOptions = ApiContext.getInstance(DefaultBotOptions.class);
//            System.getProperties().put( "socksProxyHost", "host" );
//            System.getProperties().put( "socksProxyPort", "port" );
//            Authenticator.setDefault(new Authenticator(){
//                protected PasswordAuthentication getPasswordAuthentication(){
//                    return new PasswordAuthentication("username", "password".toCharArray());
//                }
//            });

//            CredentialsProvider credsProvider = new BasicCredentialsProvider();
//            credsProvider.setCredentials(
//                    new AuthScope(PROXY_HOST, PROXY_PORT),
//                    new UsernamePasswordCredentials(PROXY_USER, PROXY_PASSWORD));

            HttpHost httpHost = new HttpHost(PROXY_HOST, PROXY_PORT);

            RequestConfig requestConfig = RequestConfig.custom().setProxy(httpHost).setAuthenticationEnabled(true).build();
            botOptions.setRequestConfig(requestConfig);
//            botOptions.setCredentialsProvider(credsProvider);
            botOptions.setHttpProxy(httpHost);

            // Register your newly created AbilityBot
            MyBot bot = new MyBot(BOT_TOKEN, BOT_NAME, botOptions);

            botsApi.registerBot(bot);

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
