package com.mediator;

public class UserApp implements User {

    private String name;
    private Chat chat;

    UserApp(String name, Chat chat) {
        this.name = name;
        this.chat = chat;
        chat.addUser(this);
    }

    public void send(String message) {
        chat.sendMessage(this, message);
    }

    public void receive(String message) {
//        recibe android/ios
    }

    public String getName() {
        return name;
    }
}
