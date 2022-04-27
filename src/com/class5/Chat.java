package com.class5;

import java.util.List;

public interface Chat {

    public void sendMessage(User user, String message);
    public void addUser(User user);

    public List<Message> getMessages();

}
