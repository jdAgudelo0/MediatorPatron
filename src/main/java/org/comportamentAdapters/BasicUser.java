package org.comportamentAdapters;

// Clase ConcreteColleague
class BasicUser extends User {
    public BasicUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + " envía mensaje: " + message);
        mediator.sendMessage(message, name);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " recibe mensaje: " + message);
    }
}