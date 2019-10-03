package com.example.repository;


import com.example.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CrudRepository extends JpaRepository<Produto, Long>{

}
