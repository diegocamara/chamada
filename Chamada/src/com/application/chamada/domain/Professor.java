package com.application.chamada.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "PROFESSOR")
public class Professor {

	@DatabaseField(canBeNull = false, width = 300)
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(nome).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Aluno) {
			final Professor professor = (Professor) obj;
			return new EqualsBuilder().append(this.nome, professor.getNome())
					.isEquals();
		} else {
			return false;
		}

	}

}
