package com.marcos.emprestimo.dto;

import java.util.ArrayList;
import java.util.List;

import com.marcos.emprestimo.entities.IEmprestimo;
import com.marcos.emprestimo.entities.Pessoa;

public class PessoaDTO {

	private String name;
	private List<IEmprestimo> loan = new ArrayList<>();

	public PessoaDTO() {
	}

	public PessoaDTO(String name, List<IEmprestimo> loan) {
		this.name = name;
		this.loan = loan;
	}
	
	public PessoaDTO(Pessoa pessoa) {
		name = pessoa.getName();
		loan = pessoa.getLoans();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<IEmprestimo> getLoan() {
		return loan;
	}

	public void setLoan(List<IEmprestimo> loan) {
		this.loan = loan;
	}

}
