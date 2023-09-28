package com.marcos.emprestimo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.emprestimo.dto.PessoaDTO;
import com.marcos.emprestimo.entities.EmprestimoConsignado;
import com.marcos.emprestimo.entities.EmprestimoGarantia;
import com.marcos.emprestimo.entities.EmprestimoPessoal;
import com.marcos.emprestimo.entities.IEmprestimo;
import com.marcos.emprestimo.entities.Pessoa;
import com.marcos.emprestimo.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	public PessoaRepository repository;
	
	public List<Pessoa> findAll(){
	List<Pessoa> pessoas = repository.findAll();
	return pessoas;	
	}

	public PessoaDTO insertPessoa(Pessoa pessoa) {
		Pessoa obj = repository.save(pessoa);
		IEmprestimo empPessoal = new EmprestimoPessoal();
		IEmprestimo empGaran = new EmprestimoGarantia();
		IEmprestimo empConsig = new EmprestimoConsignado();

		if (obj.getSalario() <= 3000.00) {
			obj.setLoans(Arrays.asList(empPessoal, empGaran));
		} else if (obj.getSalario() >= 3000.00 && obj.getSalario() <= 5000.00 && obj.getIdade() < 30
				&& obj.getLocation().equals("SP")) {
			obj.setLoans(Arrays.asList(empPessoal, empGaran));
		} else if (obj.getSalario() >= 5000.00) {
			obj.setLoans(Arrays.asList(empConsig));
		}
		PessoaDTO dto = new PessoaDTO(obj);
		return dto;
	}

}
