package com.example.demo.controller;

import com.example.demo.dao.DietetikRepository;
import com.example.demo.dao.KrvniTestRepository;
import com.example.demo.dao.ProfilRepository;
import com.example.demo.model.KrvniTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/krvniTesti")
public class KrvniTestController {

    @Autowired
    private KrvniTestRepository krvniTestDao;

    @Autowired
    private DietetikRepository dietetikDao;

    // TX implementacija izpisa vseh zapisov (GET)
    @GetMapping
    public Iterable<KrvniTest> vrniKrvneTeste() { return krvniTestDao.findAll(); }


    // TX implementacija izpisa enega zapisa (GET - glede na ID)
    @GetMapping("{id}")
    public ResponseEntity<Optional<KrvniTest>> getKrvniTestById(@PathVariable long id){
        Optional<KrvniTest> krvniTest = krvniTestDao.findById(id);
        return ResponseEntity.ok(krvniTest);
    }



    // TX dodajanje zapisa (POST)
    @PostMapping
    public KrvniTest dodajKrvniTest(@RequestBody KrvniTest krvniTest) {
        return krvniTestDao.save(krvniTest);
    }



    // TX spreminjanje podatkov zapisa (PUT)
    @PutMapping
    public KrvniTest dodajAliPosodobiKrvniTest(@RequestBody KrvniTest krvniTest) {
        return krvniTestDao.save(krvniTest);
    }



    //TX brisanje podatkov zapisa (DELETE) z ID
    @DeleteMapping("{id}")
    public  ResponseEntity<HttpStatus> izbrisiKrvniTest(@PathVariable("id") long id){
        try {
            krvniTestDao.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    // FIRST TRY
//    @GetMapping("/ks/{krvnaSkupina}/{letnik}")
//    public Iterable<KrvniTest> vrniKrvniTestiPoKrvniSkupiniInDatum(@PathVariable int krvnaSkupina,@PathVariable int letnik ){
//        return krvniTestDao.vrniKrvniTestiPoKrvniSkupiniInDatum(krvnaSkupina, letnik);
//    }

//    return krvniTestDao.vrniKrvniTestiPoKrvniSkupiniInDatum(krvna_skupina, date);



    //SECOND TRY
//    @GetMapping("/ks/{krvna_skupina}/{date}")
//    public String vrniKrvniTestiPoKrvniSkupiniInDatum(@PathVariable int krvna_skupina,@PathVariable Date date ){
//        return "Krvna skupina: " + krvna_skupina + ", Identiteta: " + date;
//    }


    // THIRD TRY
//    @GetMapping("/ks/{krvnaSkupina}/{date}")
//    public ResponseEntity<List<KrvniTest>> vrniKrvniTestiPoKrvniSkupiniInDatum(@PathVariable int krvnaSkupina, @PathVariable Date date ){
//        return new ResponseEntity<>(KrvniTestRepository.vrniKrvniTestiPoKrvniSkupiniInDatum(krvnaSkupina, date), HttpStatus.OK);
//    }

    // FORTH TRY
//    @GetMapping("/ks/{krvnaSkupina}/{letnik}")
//    public ResponseEntity<List<KrvniTest>> vrniKrvniTestiPoKrvniSkupiniInDatum(@PathVariable int krvnaSkupina, @PathVariable int letnik ){
//        return new ResponseEntity<>(KrvniTestRepository.vrniKrvniTestiPoKrvniSkupiniInDatum(krvnaSkupina, letnik), HttpStatus.OK);
//    }

    //FIFTH TRY
    // TX kompleksnejša poizvedba z vsaj 2 parametroma
    @GetMapping("/ks/{krvnaSkupina}/{letnik}")
    public Iterable<KrvniTest> vrniKrvniTestiPoKrvniSkupiniInDatum(@PathVariable int krvnaSkupina,@PathVariable int letnik ){
        //System.out.println(starost, zeljenaIzgubaKilogramov);
        return krvniTestDao.vrniKrvniTestiPoKrvniSkupiniInDatum(krvnaSkupina, letnik);
    }

}


