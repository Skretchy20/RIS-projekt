package com.example.demo.controller;

import com.example.demo.dao.HisaRepository;
import com.example.demo.dao.SobaRepository;
import com.example.demo.model.Soba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
@RequestMapping("/sobe")
public class SobaController {

    @Autowired
    private SobaRepository sobaDao;
    @Autowired
    private HisaRepository hisaDao;

    @GetMapping
    public Iterable<Soba> vrniSobe(){
        return sobaDao.findAll();
    }

    @PostMapping("/{id_hise}")
    public Optional<Soba> dodajSobo(@RequestBody Soba soba, @PathVariable(name = "id_hise") Long id){
        return hisaDao.findById(id).map(hisa -> {
            soba.setHisa(hisa);
            return sobaDao.save(soba);
        });
    }

}