package com.example.demo.controller;

import com.example.demo.dao.DietetikRepository;
import com.example.demo.dao.ProfilRepository;
import com.example.demo.dao.RegistriranUporabnikRepository;
import com.example.demo.model.Dietetik;
import com.example.demo.model.KrvniTest;
import com.example.demo.model.Profil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profili")
public class ProfilController {

    @Autowired
    private ProfilRepository profilDao;

    @Autowired
    private DietetikRepository dietetikDao;

    @Autowired
    private RegistriranUporabnikRepository registriranUporabnikDao;

    // GET Requests

    @GetMapping
    public Iterable<Profil> vrniProfile() { return  profilDao.findAll();}

    @GetMapping("/izpis/{id}")
    public ResponseEntity<Profil> vrniProfil(@RequestParam(required = true) Long id){
        Optional<Profil> profil = profilDao.findById(id);
        if (profil.isPresent()) {
            return new ResponseEntity<>(profil.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // POST Requests

    @PostMapping("/{id_profili}")
    public Optional<Profil> dodajProfil(@RequestBody Profil profil, @PathVariable(name = "id_profili") Long id){
        return registriranUporabnikDao.findById(id).map(registriranUporabnik -> {
            profil.setRegistriranUporabnik(registriranUporabnik);
            return profilDao.save(profil);
        });
    }

    /*
    // PUT Requests
    @PutMapping("/{profilId}/dietetik/{dietetikId}")
    Profil DodajProfiluDietetika(
            @PathVariable Long profilId,
            @PathVariable Long dietetikId
    ){
        // getOne more bit methoda v kateri je long id
        Profil profil = profilDao.findById(profilId).get();
        Dietetik dietetik = dietetikDao.findById(dietetikId).get();
        profil.dodajDietetika(dietetik);
        return profilDao.save(profil);
    }

     */
}
