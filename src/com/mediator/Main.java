package com.mediator;

public class Main {

    public static void main(String[] args) {
        Chat chat = new WhatsAppChat();

        User juan = new UserWeb("Juan", chat);
        User laura = new UserApp("Laura", chat);
        User tincho = new UserWeb("Tincho", chat);

        juan.send("Hola Laura");
        laura.send("Hola Juan! Todo bien?");
        tincho.send("No se olviden de mi porfa");

        for (Message message : chat.getMessages()){
            System.out.println(message.getUser().getName() + " escribio: " + message.getText());
        }
    }
}
