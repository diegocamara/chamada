package com.application.chamada.manager;

import android.content.Context;

import com.application.chamada.dao.DisciplinaDAO;

public class DisciplinaManager extends AbstractManager implements IDisciplinaManager{

	private DisciplinaDAO disciplinaDAO;
	
	public DisciplinaManager(Context context){
		inicializarDAO(context);
	}
	
	@Override
	public void inicializarDAO(Context context) {
		this.disciplinaDAO = new DisciplinaDAO(context);		
	}

	@Override
	public Object getDAO() {		
		return this.disciplinaDAO;
	}

}
