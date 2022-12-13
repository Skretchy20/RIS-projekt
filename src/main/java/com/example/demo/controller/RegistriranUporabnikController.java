package com.example.demo.controller;

import com.example.demo.dao.DietaRepository;
import com.example.demo.dao.RegistriranUporabnikRepository;
import com.example.demo.model.RegistriranUporabnik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/uporabniki")
public class RegistriranUporabnikController {

    @Autowired
    private RegistriranUporabnikRepository registriranUporabnikDao;


    // GET Requests
    @GetMapping
    public  Iterable<RegistriranUporabnik> vrniRegistriraneUporabnike() { return registriranUporabnikDao.findAll(); }


    // POST requests
    @PostMapping
    public RegistriranUporabnik dodajRegistriranUporabnik(@RequestBody RegistriranUporabnik registriranUporabnik){ return registriranUporabnikDao.save(registriranUporabnik); }

    @GetMapping("/st-profilov/{stProfilov}")
    public Iterable<RegistriranUporabnik> vrniUporabnikePoStProfilov(@PathVariable(name = "stProfilov") int stProfilov){
        System.out.println(stProfilov);
        return registriranUporabnikDao.vrniUporabnikePoStProfilov(stProfilov);
    }


}

