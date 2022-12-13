package com.example.demo.controller;

import com.example.demo.dao.DietaRepository;
import com.example.demo.dao.DietetikRepository;
import com.example.demo.dao.KrvniTestRepository;
import com.example.demo.dao.RegistriranUporabnikRepository;
import com.example.demo.model.Dietetik;
import com.example.demo.model.KrvniTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dietetik")
public class DietetikController {

    @Autowired
    private DietetikRepository dietetikDao;
//
//    @Autowired
//    private KrvniTestRepository krvniTestDao;


    @GetMapping("/whatup")
    public String hello(){
        return "PleaseWork";
    }



    // TX implementacija izpisa vseh zapisov (GET)
    @GetMapping
    public Iterable<Dietetik> vrniDietetike() { return dietetikDao.findAll(); }


    // TX implementacija izpisa enega zapisa (GET - glede na ID)
    @GetMapping("{id}")
    public ResponseEntity<Optional<Dietetik>> getDietetikById(@PathVariable long id){
        Optional<Dietetik> dietetik = dietetikDao.findById(id);
        return ResponseEntity.ok(dietetik);
    }


    // TX dodajanje zapisa (POST)
    @PostMapping
    public Dietetik dodajDietetik(@RequestBody Dietetik dietetik) {
        return dietetikDao.save(dietetik);
    }


    // TX spreminjanje podatkov zapisa (PUT)
    @PutMapping
    public Dietetik dodajAliPosodobiDietetik(@RequestBody Dietetik dietetik) {
        return dietetikDao.save(dietetik);
    }


    //TX brisanje podatkov zapisa (DELETE) z ID
    @DeleteMapping("{id}")
    public  ResponseEntity<HttpStatus> izbrisiDietetik(@PathVariable("id") long id){
        try {
            dietetikDao.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


//    //kompleksnejša poizvedba, ki vključuje vsaj 2 modela
//    @GetMapping("/sprobaj/{krvnaSkupina}")
//    public Iterable<Dietetik> vrniDietetike(@PathVariable(name = "krvnaSkupina") int krvnaSkupina){
////        System.out.println(krvnaSkupina);
//        return dietetikDao.vrniDietetike(krvnaSkupina);
//    }

    // TX kompleksnejša poizvedba z vsaj 2 parametroma (Sprint 2)
    @GetMapping("/sprobaj/{ime}/{krvnaSkupina}")
    public Iterable<Dietetik> vrniDietetike(@PathVariable String ime,@PathVariable int krvnaSkupina){
        return dietetikDao.vrniDietetike(ime, krvnaSkupina);
    }





}
