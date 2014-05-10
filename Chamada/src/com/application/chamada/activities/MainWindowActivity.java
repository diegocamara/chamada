package com.application.chamada.activities;

import android.app.Activity;
import android.os.Bundle;

import com.application.chamada.R;
import com.application.chamada.domain.Aluno;
import com.application.chamada.manager.AlunoManager;
import com.application.chamada.manager.IAlunoManager;

public class MainWindowActivity extends Activity{

	IAlunoManager alunoManager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_window_layout);
		
		alunoManager = new AlunoManager(getApplicationContext());
		
		Aluno aluno = new Aluno();
		aluno.setCodigo(1);
		aluno.setNome("Aluno 1");
		
		alunoManager.salvarOuAtualizar(aluno);
		
		
	}
	
}
