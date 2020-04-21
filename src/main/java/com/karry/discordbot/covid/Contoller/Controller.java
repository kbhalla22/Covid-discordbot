package com.karry.discordbot.covid.Contoller;

import com.karry.discordbot.covid.service.CoronaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {


    @Autowired
    private CoronaService coronaService;


    @GetMapping("/test123")
    public void hello(){
        coronaService.getStatistics("India");
    }
}
