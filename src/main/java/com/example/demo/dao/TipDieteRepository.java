package com.example.demo.dao;

import com.example.demo.model.KrvniTest;
import com.example.demo.model.TipDiete;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TipDieteRepository extends CrudRepository<TipDiete, Long> {
    @Query(value = "select t from TipDiete t, Dieta d where t.tipDiete = d and t.rating >= ?1 and d.kalorije >= ?2",nativeQuery = true)
//    @Query(value = "select t from TipDiete t, Dieta d where t.ime = ?1 and d.kalorije >= ?2",nativeQuery = true)
    List<TipDiete> vrniTipDiete(int rating, int kalorije);
}
