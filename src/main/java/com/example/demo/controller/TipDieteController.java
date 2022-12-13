package com.example.demo.controller;

import com.example.demo.dao.DietaRepository;
import com.example.demo.dao.DietetikRepository;
import com.example.demo.dao.KrvniTestRepository;
import com.example.demo.dao.TipDieteRepository;
import com.example.demo.model.KrvniTest;
import com.example.demo.model.TipDiete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/tip")
public class TipDieteController {

    @Autowired
    private TipDieteRepository tipDieteDao;

//    @Autowired
//    private DietaRepository dietaDao;



    // TX implementacija izpisa vseh zapisov (GET)
    @GetMapping
    public Iterable<TipDiete> vrniTipDiete() { return tipDieteDao.findAll(); }

    // TX dodajanje zapisa (POST)
    @PostMapping
    public TipDiete dodajTipDiete(@RequestBody TipDiete tipDiete) {
        return tipDieteDao.save(tipDiete);
    }


    // TX kompleksnejša poizvedba z vsaj 2 parametroma (Sprint 2)
    @GetMapping("/sredstva-kilogrami/{rating}/{kalorije}")
    public Iterable<TipDiete> vrniTipDiete(@PathVariable int rating, @PathVariable int kalorije){
        return tipDieteDao.vrniTipDiete(rating, kalorije);
    }



}
