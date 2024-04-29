package org.comportamentAdapters;

import java.util.HashMap;
import java.util.Map;

//class concreteMediator
class ChatRoom implements ChatMediator {
    private Map<String, User> users;

    public ChatRoom() {
        this.users = new HashMap<>();
    }

    @Override
    public void sendMessage(String message, String username) {
        User user = users.get(username);
        if (user != null) {
            user.receiveMessage(message);
        } else {
            System.out.println("Usuario '" + username + "' no encontrado.");
        }
    }

    @Override
    public void addUser(User user) {
        users.put(user.getName(), user);
    }
}