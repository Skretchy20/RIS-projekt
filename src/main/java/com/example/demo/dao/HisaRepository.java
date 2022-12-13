package com.example.demo.dao;

import com.example.demo.model.Hisa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HisaRepository extends CrudRepository<Hisa, Long> {
    @Query("select h from Hisa h, Soba s where s.hisa = h and s.velikost >= ?1")
    List<Hisa> vrniHisePoVelikostiSob(double velikost);
}