package org.ambar.app.controller;

import org.ambar.app.domain.Producto;
import org.ambar.app.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {

	@Autowired
	private ProductoRepository repository;
	
	@RequestMapping("/data/productos")
	public Page<Producto> getAll(@RequestParam(value="page", defaultValue="1") Integer page,
								 @RequestParam(value="limit", defaultValue="10") Integer limit,
								 @RequestParam(value="sorting", defaultValue="") String sorting){
		
		PageRequest pageRequest = new PageRequest(page-1, limit);
	
		return this.repository.findAll(pageRequest);
	}

	@RequestMapping("/data/producto/{id}")
	public Producto getById(@PathVariable Long id){
		return this.repository.findOne(id);
	}
}
