package com.example.ris.controller;


import com.example.ris.dao.HisaRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hise")
public class PrehranoController {

    private HisaRepository hisaDao;

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

//    @GetMapping
//    public Iterable<Hisa> vrniHise(){
//
//    }
//
//    @PostMapping
//    public Hisa dodajHiso(@RequestBody Hisa hisa){
//        return hisaDao.save(hisa);
//    }


}
