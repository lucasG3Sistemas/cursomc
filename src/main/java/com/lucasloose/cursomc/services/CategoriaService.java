package com.lucasloose.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasloose.cursomc.domain.Categoria;
import com.lucasloose.cursomc.repositories.CategoriaRepository;
import com.lucasloose.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscar(Integer id) {
		Categoria categoria = categoriaRepository.findOne(id);
		if (categoria == null) {
			throw new ObjectNotFoundException("Categoria não encontrada! ID: " + id
					+ ", Tipo: " + Categoria.class.getName());
		}
		return categoria;
	}
	
}
