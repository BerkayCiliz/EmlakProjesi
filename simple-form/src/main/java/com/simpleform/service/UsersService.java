package com.simpleform.service;


import com.simpleform.model.UsersModel;
import com.simpleform.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public UsersModel registerUser(String login, String password, String email, String ad, String soyad, String telefon){
        if(login == null && password == null) {
            return null;
        }else {
            UsersModel usersModel = new UsersModel();
            usersModel.setLogin(login);
            usersModel.setPassword(password);
            usersModel.setEmail(email);
            usersModel.setAd(ad);
            usersModel.setSoyad(soyad);
            usersModel.setTelefon(telefon);
            return usersRepository.save(usersModel);
        }
    }

    public UsersModel authenticate(String login, String password){

        return usersRepository.findByLoginAndPassword(login, password).orElse(null);
    }
}

