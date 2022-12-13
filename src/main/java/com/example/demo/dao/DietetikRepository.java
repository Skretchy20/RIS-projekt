package com.example.demo.dao;
import com.example.demo.model.Dietetik;
import com.example.demo.model.Hisa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DietetikRepository extends CrudRepository<Dietetik, Long> {
//    @Query("select d from Dietetik d, KrvniTest k where d.hisa = d and k.krvnaSkupina = ?1")
//    @Query("select d from KrvniTest d where d.krvnaSkupina = ?1") //TO DELA
//    @Query("select d from Dietetik d, KrvniTest k where d.dietetik = d and k.krvnaSkupina = ?1")
    @Query(value = "select d from Dietetik d, KrvniTest k where d.dietetik = k and d.ime = ?2 and k.krvnaSkupina = ?1", nativeQuery = true)
    List<Dietetik> vrniDietetike(String ime,int krvnaSkupina);
}
