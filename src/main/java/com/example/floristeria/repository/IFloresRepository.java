package com.example.floristeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.floristeria.model.FloresModel;

@Repository
public interface IFloresRepository extends JpaRepository<FloresModel, Long>{

  
}
