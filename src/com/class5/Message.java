package com.class5;

public class Message {

    private String text;
    private User user;

    Message(User user, String text){
        this.user = user;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public User getUser() {
        return user;
    }


}
