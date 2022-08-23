package com.simpleform.controller;


import com.simpleform.model.MusteriModel;
import com.simpleform.service.MusteriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller


public class MusteriController {

    @Autowired
    private final MusteriService musteriService;

    public MusteriController(MusteriService musteriService){
        this.musteriService = musteriService;
    }

    @GetMapping("/musteri")
    public String getMusteriPage(Model model){
        model.addAttribute("musteriRequest",new MusteriModel());
        return "musteri_page";

    }
    @PostMapping("/musteriEkle")
    public String musteri(Model model, @ModelAttribute MusteriModel musteriModel){
        System.out.println("musteri request:"+ musteriModel);
        MusteriModel musteridUser= musteriService.musteriUser(musteriModel.getEmlakTur(), musteriModel.getMetrekare(), musteriModel.getOdaSayi(),musteriModel.getKat());
        model.addAttribute("emlakList", musteriService.getList());
        return "personal_page";
    }

    @GetMapping("/personal")
    public String getMusteriList(Model model){
        System.out.println("emlak list :"+ musteriService.getList());
        model.addAttribute("emlakList", musteriService.getList());
        return "personal_page";

    }
}
