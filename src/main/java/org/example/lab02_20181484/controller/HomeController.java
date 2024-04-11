package org.example.lab02_20181484.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/patito_hule")
    public String index(){
        return "home";}
    @GetMapping("/patito_hule/fotos")
    public String vistafotos(){
        return "fotos_patitos";}
}
