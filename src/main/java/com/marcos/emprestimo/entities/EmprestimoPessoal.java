package com.marcos.emprestimo.entities;

import java.io.Serializable;

import com.marcos.emprestimo.enums.EmprestimoEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmprestimoPessoal extends IEmprestimo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Override
	public EmprestimoEnum getTipo() {
		return EmprestimoEnum.PESSOAL;
	}

	@Override
	public Integer getTaxaJuros() {
		return 4;
	}

}
