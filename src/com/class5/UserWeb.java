package com.class5;

public class UserWeb implements User {

    private String name;
    private Chat chat;

     UserWeb(String name, Chat chat) {
        this.name = name;
        this.chat = chat;
        chat.addUser(this);
    }

    public void send(String message) {
        chat.sendMessage(this, message);
    }

    public void receive(String message) {
//        recibe HTML
    }

    public String getName() {
        return name;
    }
}
