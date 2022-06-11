package com.mediator;

public class UserWeb implements User {

    private String name;
    private Chat chat;

     UserWeb(String name, Chat chat) {
        this.name = name;
        this.chat = chat;
        chat.addUser(this);
    }

    public void send(String message) {
        System.out.println(this.getName() + " escribio: " + message);
        chat.sendMessage(this, message);
    }

    public void receive(String message) {
        System.out.println(this.getName() + " recibio: " + message);
//        recibe HTML
    }

    public String getName() {
        return name;
    }
}
