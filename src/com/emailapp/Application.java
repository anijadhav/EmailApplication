package com.emailapp;

import com.emailapp.model.Email;

public class Application {
    public static void main(String[] args) {
        Email email=new Email("Aniket","Jadhav");
        System.out.println(email.showInfo());
    }
}
