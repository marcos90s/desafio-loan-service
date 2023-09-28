package com.marcos.emprestimo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.emprestimo.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, String> {

}
