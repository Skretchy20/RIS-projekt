package com.example.ris.dao;

import com.example.ris.models.Dieta;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DietaRepository extends CrudRepository<Dieta, Long> {

    List<Dieta> steviloKalorije(int kalorije);
}
