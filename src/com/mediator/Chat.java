package com.mediator;

import java.util.List;

public interface Chat {

    public void sendMessage(User user, String message);
    public void addUser(User user);

    public List<Message> getMessages();

}
