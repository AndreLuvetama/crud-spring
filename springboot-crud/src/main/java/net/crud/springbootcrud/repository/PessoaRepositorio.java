package net.crud.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.crud.springbootcrud.model.Pessoa;

@Repository
public interface PessoaRepositorio extends JpaRepository<Pessoa, Long> {

}
