package com.trx.example.mediator.chatroom;

public class ChatRoom {

    public void showMsg(User user,String msg){

        System.out.println("[" + user.getName() + "] : " + msg);
    }
}
