package ru.alexander.learning.telegram2;

import org.telegram.abilitybots.api.bot.AbilityBot;
import org.telegram.abilitybots.api.objects.Ability;
import org.telegram.telegrambots.bots.DefaultBotOptions;

import static org.telegram.abilitybots.api.objects.Locality.ALL;
import static org.telegram.abilitybots.api.objects.Privacy.PUBLIC;

public class MyBot extends AbilityBot {

    protected MyBot(String botToken, String botUsername, DefaultBotOptions options) {
        super(botToken, botUsername, options);
    }

    public int creatorId() {
        return 0;
    }

    public Ability hello() {
        return Ability.builder()
                .name("test")
                .info("hello bot")
                .locality(ALL)
                .privacy(PUBLIC)
                .action(ctx -> silent.send("hello!", ctx.chatId()))
                .build();
    }
}