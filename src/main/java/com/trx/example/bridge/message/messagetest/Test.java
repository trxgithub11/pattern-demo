package com.trx.example.bridge.message.messagetest;

public class Test {

    public static void main(String[] args) {
        IMessage message = new SmsMessage("����","����");
        AbstractMessage abstractMessage = new NormMessage(message);
        abstractMessage.send("����","����");
    }
}
