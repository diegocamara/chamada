package com.application.chamada.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "ALUNO")
public class Aluno {

	@DatabaseField(id = true, canBeNull = false, width = 11)
	private String matricula;

	@DatabaseField(canBeNull = false, width = 300)
	private String nome;

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(matricula).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Aluno) {
			final Aluno aluno = (Aluno) obj;
			return new EqualsBuilder().append(this.matricula,
					aluno.getMatricula()).isEquals();
		} else {
			return false;
		}

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
