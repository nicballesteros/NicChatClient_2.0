package com.nicballesteros.message.client.messagesender;

public class Message {
    private String message;
    private int from;
    private int to;

    Message(String message, int from, int to){
        this.message = message;
        this.from = from;
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public boolean contains(int id){
        if(from == id || to == id){
            return true;
        }
        else{
            return false;
        }
    }
}