package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.DbRepositroy;
import com.tpe.repository.Repo;

public class MailService implements MessageService{


    private Repo repo;//mailservise bir field tanımla

    public MailService(Repo repo) {//bağımlı olduğu objeyi newlemek yerine
        this.repo = repo;           //constructorda parametre olarak aldık daha sonra mailservice i
        //kullanacağımız zaman bağımlı objeyi oluşturup içerisine enjekte ettik.
    }

    public void sendMessage(Message message){
        System.out.println("Ben bir Mail servisiyim. Mesajınız: "+message.getMessage());
    }

    @Override
    public void saveMessage(Message message) {
        //repodaki save metodunu kullanmam gerekiyor??
//        Repo repo=new FileRepository();
        repo.save(message);
    }


}
