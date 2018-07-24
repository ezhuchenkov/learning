package ru.alexander.learning.currencybase;

import java.util.concurrent.*;

public class Executor {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleWithFixedDelay(() ->
                {
                    BaseConnector baseConnector = new BaseConnector();
                    baseConnector.baseConnector();

                },0, 1, TimeUnit.DAYS

        );
    }
}



