package com.lucasloose.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasloose.cursomc.domain.Categoria;
import com.lucasloose.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscar(Integer id) {
		Categoria categoria = categoriaRepository.findOne(id);
		return categoria;
	}
	
}
