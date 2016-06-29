package org.ambar.app.controller;

import java.util.List;

import org.ambar.app.domain.Categoria;
import org.ambar.app.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository repository;
	
	@RequestMapping("/data/categorias")
	public List<Categoria> getAll(){
		return (List<Categoria>) this.repository.findAll();
	}

}
