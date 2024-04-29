package org.comportamentAdapters;

// Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        ChatMediator chatroom = new ChatRoom();

        User user1 = new BasicUser(chatroom, "Alice");
        User user2 = new BasicUser(chatroom, "Bob");
        User user3 = new BasicUser(chatroom, "Charlie");

        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);

        user1.sendMessage("Hola a todos!");
        user2.sendMessage("Hola Alice!");
        user3.sendMessage("¡Hola Bob y Alice!");
    }
}