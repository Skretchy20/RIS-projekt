package com.example.demo.dao;

import com.example.demo.model.RegistriranUporabnik;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RegistriranUporabnikRepository extends CrudRepository<RegistriranUporabnik, Long> {
    @Query("select r from RegistriranUporabnik r, Profil p where p.registriranUporabnik = r and p.stProfilov >= ?1")
    List <RegistriranUporabnik> vrniUporabnikePoStProfilov(int stProfilov);
}
