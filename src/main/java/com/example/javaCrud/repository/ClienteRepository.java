package com.example.javaCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.javaCrud.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
