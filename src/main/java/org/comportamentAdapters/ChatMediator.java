package org.comportamentAdapters;

// Interfaz Mediator
interface ChatMediator {
    void sendMessage(String message, String username);
    void addUser(User user);
}