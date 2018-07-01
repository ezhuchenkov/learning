package ru.alexander.learning.threelayer;

//взаимодействие с использователем
public class MyResource {

    private final MyService service;

    public MyResource(MyService service) {
        this.service = service;
    }

    public void doSmt(DoSmtDto arg) {
        //do smt,,,
        service.giveGiftToPlayer(arg.playerId);
        //response
    }

    public static class DoSmtDto { //dto = data transfer object
        int playerId;
    }

}
