package com.tpe.repository;

import com.tpe.domain.Message;

public class DbRepositroy implements Repo{


    @Override
    public void save(Message message) {
        System.out.println("Mesajınız DB'ye kaydediliyor... Mesajınız:  "+message.getMessage());
    }
}
