package com.example.demo.dao;

import com.example.demo.model.Dieta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DietaRepository extends CrudRepository<Dieta, Long> {

}
