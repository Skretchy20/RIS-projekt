package com.example.demo.controller;

import com.example.demo.dao.HisaRepository;
import com.example.demo.model.Hisa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hise")
public class HisaController {

    @Autowired
    private HisaRepository hisaDao;

    // GET Requests

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/error")
    public String error(){
        return "Error";
    }

    @GetMapping
    public Iterable<Hisa> vrniHise(){
        return hisaDao.findAll();
    }

    // POST requests

    @PostMapping
    public Hisa dodajHiso(@RequestBody Hisa hisa){
        return hisaDao.save(hisa);
    }

    @GetMapping("/velikost-sob/{velikost}")
    public Iterable<Hisa> vrniHisePoVelikostiSob(@PathVariable(name = "velikost") double velikost){
        System.out.println(velikost);
        return hisaDao.vrniHisePoVelikostiSob(velikost);
    }
}