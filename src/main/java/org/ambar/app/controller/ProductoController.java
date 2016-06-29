package org.ambar.app.controller;

import java.util.List;

import org.ambar.app.domain.Producto;
import org.ambar.app.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {

	@Autowired
	private ProductoRepository repository;
	
	@RequestMapping("/data/productos")
	public List<Producto> getAll(){
		return (List<Producto>) this.repository.findAll();
	}

	@RequestMapping("/data/producto/{id}")
	public Producto getById(@PathVariable Long id){
		return this.repository.findOne(id);
	}
}
