package com.trx.example.bridge.message;

public class SmsMessage implements IMessage {
    public void send(String message, String toUser) {

        System.out.println("ʹ�ö�����Ϣ����" + message + "��" + toUser);
    }
}
