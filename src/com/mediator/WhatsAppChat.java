package com.mediator;


import java.util.ArrayList;
import java.util.List;

public class WhatsAppChat implements Chat {
    private List<User> users;
    private List<Message> messages;

    WhatsAppChat() {
        messages = new ArrayList<>();
        users = new ArrayList<>();
    }
    public void sendMessage(User user, String message) {
        messages.add(new Message(user, message));
        for (User u : this.users){
            if(u != user) u.receive(message);
        }
    }

    public void addUser(User user) {
        users.add(user);
    };

    public List<Message> getMessages() {
        return messages;
    }
}
