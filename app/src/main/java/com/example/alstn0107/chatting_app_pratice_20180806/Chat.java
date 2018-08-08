package com.example.alstn0107.chatting_app_pratice_20180806;

public class Chat {
    public String email;

    public String text;

    public Chat() {
        // Default constructor required for calls to DataSnapshot.getValue(Comment.class)
    }

    public Chat( String text) {

        this.text = text;
    }

}
