package com.marcos.emprestimo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.emprestimo.dto.PessoaDTO;
import com.marcos.emprestimo.entities.Pessoa;
import com.marcos.emprestimo.repository.PessoaRespository;
import com.marcos.emprestimo.service.PessoaService;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaResource {

	@Autowired
	public PessoaRespository repository;

	@Autowired
	public PessoaService service;

	@GetMapping
	public ResponseEntity<List<Pessoa>> findAll() {
		List<Pessoa> pessoas = repository.findAll();
		return ResponseEntity.ok(pessoas);

	}

	@PostMapping(value = "/insert")
	public ResponseEntity<PessoaDTO> insertPessoa(@RequestBody Pessoa pessoa) {
		PessoaDTO obj = service.insertPessoa(pessoa);
		return ResponseEntity.ok(obj);

	}
}
