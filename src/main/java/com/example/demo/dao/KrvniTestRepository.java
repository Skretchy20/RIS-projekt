package com.example.demo.dao;
import com.example.demo.model.Hisa;
import com.example.demo.model.KrvniTest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.Date;
import java.util.List;


public interface KrvniTestRepository extends CrudRepository<KrvniTest, Long> {
//    @Query("select k from KrvniTest k where k.krvnaSkupina = 2 and k.date >= '2020-01-01';")
@Query("select k from KrvniTest k where k.krvnaSkupina = ?1 and k.letnik >= ?2")
//    List<KrvniTest> vrniKrvniTestiPoKrvniSkupiniInDatum(int krvnaSkupina, Date date);
List<KrvniTest> vrniKrvniTestiPoKrvniSkupiniInDatum(int krvnaSkupina, int letnik);
//    public static List<KrvniTest> vrniKrvniTestiPoKrvniSkupiniInDatum(int krvnaSkupina, int letnik) {
//        return null;
//    }

}

