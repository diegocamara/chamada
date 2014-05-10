package com.application.chamada.domain;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "HORARIOAULA")
public class HorarioAula {

	@DatabaseField
	private DateTime horaInicio;
	
	@DatabaseField
	private DateTime horaFim;
	
}
