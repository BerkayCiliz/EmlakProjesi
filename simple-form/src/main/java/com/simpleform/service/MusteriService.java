package com.simpleform.service;


import com.simpleform.model.MusteriModel;
import com.simpleform.repository.MusteriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusteriService {

    @Autowired
    private final MusteriRepository musteriRepository;

    public MusteriService(MusteriRepository musteriRepository){
        this.musteriRepository = musteriRepository;
    }

    public MusteriModel musteriUser(String emlakTur, Integer metrekare, Integer odaSayi, Integer kat){

        MusteriModel musteriModel = new MusteriModel();
        musteriModel.setEmlakTur(emlakTur);
        musteriModel.setMetrekare(metrekare);
        musteriModel.setOdaSayi(odaSayi);
        musteriModel.setKat(kat);
        return musteriRepository.save(musteriModel);

    }

    public List<MusteriModel> getList(){
        return musteriRepository.findAll();
    }

}
