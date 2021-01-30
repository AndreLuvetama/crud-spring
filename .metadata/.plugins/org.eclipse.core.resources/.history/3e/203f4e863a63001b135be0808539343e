package net.crud.springbootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.crud.springbootcrud.model.Pessoa;
import net.crud.springbootcrud.repository.PessoaRepositorio;

@RestController
@RequestMapping("/api/v1")
public class PessoaController {
	
	@Autowired
	private PessoaRepositorio pessoaRepositorio;
	
	@GetMapping("/pessoas")
	public List<Pessoa> getTodasPessoas(){
		return pessoaRepositorio.findAll();
	}

}
