package com.example.demo.controller;

import com.example.demo.dao.DietaRepository;
import com.example.demo.dao.RegistriranUporabnikRepository;
import com.example.demo.dao.TipDieteRepository;
import com.example.demo.model.Dieta;
import com.example.demo.model.Dietetik;
import com.example.demo.model.TipDiete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@RestController
@RequestMapping("/diete")
public class DietaController {

    @Autowired
    private DietaRepository dietaDao;

    @Autowired
    private TipDieteRepository tipDieteDao;




    // TX implementacija izpisa vseh zapisov (GET)
    @GetMapping
    public Iterable<Dieta> vrniTipDiete() { return dietaDao.findAll(); }

    // TX dodajanje zapisa (POST)
    @PostMapping
    public Dieta dodajTipDiete(@RequestBody Dieta dieta) {
        return dietaDao.save(dieta);
    }




}
