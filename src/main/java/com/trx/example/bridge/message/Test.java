package com.trx.example.bridge.message;

public class Test {
    public static void main(String[] args) {

        IMessage message = new SmsMessage();
        AbstactMessage abstactMessage = new NormalMessage(message);
        abstactMessage.sendMessage("�Ӱ�����","����");
        message = new EmailMessage();
        abstactMessage = new UrgencyMessage(message);
        abstactMessage.sendMessage("�Ӱ�����","����");
    }
}
