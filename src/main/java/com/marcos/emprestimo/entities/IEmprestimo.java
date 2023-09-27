package com.marcos.emprestimo.entities;

import java.io.Serializable;

import com.marcos.emprestimo.enums.EmprestimoEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public abstract class IEmprestimo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	abstract EmprestimoEnum getTipo();

	abstract Integer getTaxaJuros();

}
